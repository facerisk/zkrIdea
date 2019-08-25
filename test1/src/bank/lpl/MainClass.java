package bank.lpl;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 * 为什么客户类型与不同 类型号码能对应的上
 * @author 李小李
 *
 */
public class MainClass {
	public static void main(String[] args) {
		//线程开始就确定的每个线程的用户类型，并在线程池中持续的获取服务。
		for(int i=1;i<5;i++){
			 ServiceWindow  commonWindow = new ServiceWindow();
			 commonWindow.setWindowId(i);
			 commonWindow.start();
		}
		ServiceWindow  expressWindow = new ServiceWindow();
		 expressWindow.setType(CustomerType.EXPRESS);
		 expressWindow.start();
		
		 ServiceWindow  vipWindow = new ServiceWindow();
		 vipWindow.setType(CustomerType.VIP);
		 vipWindow.start();
		 
		 //取号
		 Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				 new Runnable() {
					
					@Override
					public void run() {
						Integer number = NumberMachine.getInstance().getCommonManager().generateNewManager();
						System.out.println(number+"号普通客户等待服务！");
					}
				},
				 0,//多长时间来人
				 Constants.COMMON_CUSTOMER_INTERVAL_TIME, //每隔多少时间来
				 TimeUnit.SECONDS//时间单位-s
				 );
		 Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				 new Runnable() {
					
					@Override
					public void run() {
						Integer number = NumberMachine.getInstance().getVipManager().generateNewManager();
						System.out.println(number+"号vip客户等待服务！");
					}
				},
				 0,//多长时间来人
				 Constants.COMMON_CUSTOMER_INTERVAL_TIME  * 6, //每隔多少时间来
				 TimeUnit.SECONDS//时间单位-s
				 );
		 Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				 new Runnable() {
					
					@Override
					public void run() {
						Integer number = NumberMachine.getInstance().getExpressManager().generateNewManager();
						System.out.println(number+"号快速客户等待服务！");
					}
				},
				 0,//多长时间来人
				 Constants.COMMON_CUSTOMER_INTERVAL_TIME  * 2, //每隔多少时间来
				 TimeUnit.SECONDS//时间单位-s
				 );
		
		
	}
}

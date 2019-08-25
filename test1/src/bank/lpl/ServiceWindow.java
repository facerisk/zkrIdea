package bank.lpl;

import java.util.Random;
import java.util.concurrent.Executors;

/**
 * 该类为服务窗口类，有三个不同的的客户类型
 * 公共方法start封装着一个单线程，
 * 该类一直在抓数据
 * @author 李小李
 *
 */
public class ServiceWindow {
	private CustomerType type = CustomerType.COMMON;
	private int windowId = 1;
	
	public void setType(CustomerType type) {
		this.type = type;
	}

	public void setWindowId(int windowId) {
		this.windowId = windowId;
	}

	public void start(){
		Executors.newSingleThreadExecutor().execute(new Runnable() {
			
			@Override
			public void run() {
				//无限循环
				while(true){
			/*		if(type == CustomerType.COMMON )
					NumberMachine.getInstance().getCommonManager()*/
					switch(type){
						case COMMON:
						commonService();
							break;
						case  EXPRESS:
							expressService();
							break;
						case VIP:
							vipService();
							break;
					}
				}
			}
		});
	}
	private void commonService() {
		String windowName = "第"+windowId+"号"+type+"窗口";
		//获得客户号码，并在集合中删除
		Integer number = NumberMachine.getInstance().getCommonManager().fetchServiceNumber();
		System.out.println(windowName+"正在获取服务");
		if(number != null){
			System.out.println(windowName+"为第"+number+"个"+"普通"+"客户服务");
			long beginTime = System.currentTimeMillis();//前时间
			/**
			 * 服务时间定义为常量，0s -> 8s
			 */
			int maxRandom = Constants.MAX_SERVICE_TIME - Constants.MIN_SERVICE_TIME;
			long serverTime = new Random().nextInt(maxRandom)+1+Constants.MIN_SERVICE_TIME;
			try {
				Thread.sleep(serverTime);
				System.out.println(serverTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long costTime = System.currentTimeMillis()-beginTime;//总时间
			System.out.println(windowName+"为第"+number+"个"+type+"完成服务，耗时："+costTime/1000+"s");
		}else{
			System.out.println(windowName+"没有取到服务任务，先休息1秒！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void expressService() {
		String windowName = "第"+windowId+"号"+type+"窗口";
		Integer number = NumberMachine.getInstance().getExpressManager().fetchServiceNumber();
		System.out.println(windowName+"正在获取服务");
		if(number != null){
			System.out.println(windowName+"为第"+number+"个"+type+"客户服务");
			long beginTime = System.currentTimeMillis();
//			int maxRandom = Constants.MAX_SERVICE_TIME - Constants.MIN_SERVICE_TIME;
//			long serverTime = new Random().nextInt(maxRandom)+1+Constants.MIN_SERVICE_TIME;
			try {
				Thread.sleep(Constants.MIN_SERVICE_TIME);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long costTime = System.currentTimeMillis()-beginTime;
			System.out.println(windowName+"为第"+number+"个"+type+"完成服务，耗时："+costTime/1000+"s");
		}else{
			System.out.println(windowName+"没有取到服务任务");
			commonService();
		}
	}
	private void vipService() {
		String windowName = "第"+windowId+"号"+type+"窗口";
		Integer number = NumberMachine.getInstance().getVipManager().fetchServiceNumber();
		System.out.println(windowName+"正在获取服务");
		if(number != null){
			System.out.println(windowName+"为第"+number+"个"+type+"客户服务");
			long beginTime = System.currentTimeMillis();
			int maxRandom = Constants.MAX_SERVICE_TIME - Constants.MIN_SERVICE_TIME;
			long serverTime = new Random().nextInt(maxRandom)+1+Constants.MIN_SERVICE_TIME;
			try {
				Thread.sleep(serverTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long costTime = System.currentTimeMillis()-beginTime;
			System.out.println(windowName+"为第"+number+"个"+type+"完成服务，耗时："+costTime/1000+"s");
		}else{
			System.out.println(windowName+"没有取到服务任务");
			commonService();//没有vip可以帮助普通用户
		
		}
	}
	
	

}

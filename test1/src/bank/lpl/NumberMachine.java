package bank.lpl;

/**
 * 号码机器
 * 单例模式生成一个号码机器，让其在整个程序中是共享唯一的，其中有三个号码属性普通管理，快速管理，
 * VIP管理
 * 
 */
public class NumberMachine {
	
	private NumberManager commonManager = new NumberManager();
	private NumberManager expressManager = new NumberManager();
	private NumberManager vipManager = new NumberManager();
	public NumberManager getCommonManager() {
		return commonManager;
	}
	public void setCommonManager(NumberManager commonManager) {
		this.commonManager = commonManager;
	}
	public NumberManager getExpressManager() {
		return expressManager;
	}
	public void setExpressManager(NumberManager expressManager) {
		this.expressManager = expressManager;
	}
	public NumberManager getVipManager() {
		return vipManager;
	}
	public void setVipManager(NumberManager vipManager) {
		this.vipManager = vipManager;
	}
	
	private NumberMachine(){
		
	}
	public static NumberMachine getInstance(){
		return instance;
	}
   private static NumberMachine instance = new NumberMachine();
}

package bank.lpl;

public enum CustomerType {
	COMMON,EXPRESS,VIP;
	public String toString(){
		switch(this){
		case COMMON:
			return "普通";
		case EXPRESS:
			return "快速";
		case VIP:
			return "vip";
		}
		return null;
	}
}

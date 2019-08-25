package bank.lpl;

import java.util.ArrayList;
import java.util.List;
/**
 * 号码管理器
 * 将号码管理中的号码，同步的存放在list集合中，该类作为号码机器类的属性，
 * 其中有获取新号码方法，和取得服务号码。
 * 当获取号码时自增的号码在同一对象线程获取，所以要同步
 * generateNewManager和fetchServiceNumber两个方法操作同一个属性所以synchronized互斥。
 * 
 * */

public class NumberManager {
	private int lastNumber = 1;
	private List<Integer> queueNumber = new ArrayList<Integer>();
	public synchronized Integer generateNewManager(){
		queueNumber.add(lastNumber);
		return lastNumber++;
	}
	//是真的在删除号码吗？是会在List 集合中删除，但会返回删除的number
	public synchronized Integer fetchServiceNumber(){
		Integer number = null;
		if(queueNumber.size()>0){
			number = queueNumber.remove(0);
		}
		return number;
	}
}

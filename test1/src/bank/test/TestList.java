package bank.test;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		int lastNumber = 1;
		List<Integer> queueNumber = new ArrayList<Integer>();
		queueNumber.add(lastNumber);
		if(queueNumber.size()==1){
		System.out.println(queueNumber.get(0));
		}
		int number = queueNumber.remove(0);
		System.out.println(number);
		if(queueNumber.size()==0){
//			System.out.println(12);
			System.out.println(queueNumber.get(0));
		}

	}



}

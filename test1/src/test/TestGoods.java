package test;

import java.util.HashMap;

class Goods {
	int no;
	String name;
	Double price;
	int i=0;

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int no, String name, Double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		// return super.hashCode();
//		++i;
		System.out.println("hashcode");
		return i;
	}

	@Override
	public boolean equals(Object obj) {
//		 return super.equals(obj);
		System.out.println("equals");
		if(super.equals(obj)){
			return true;
		}else{
			if(obj instanceof Goods){
				Goods g = (Goods)obj;
				if(g.no ==this.no &&g.name ==this.name){
					return true;
				}
			}
			return false;
		}
	}

//	@Override
//	public String toString() {
//		// return super.toString();
//		return "我是个好孩子 ";
//	}

}

public class TestGoods {
	public static void main(String[] args) {
		Goods good = new Goods(1,"lpl",1.1);
		Goods goods = new Goods(1, "lpl", 12.12);
		System.out.println(goods.name);
		System.out.println(goods);
		HashMap n =null;
		if (good.equals(goods)) {
			System.out.println("相等");
		} else {
			System.out.println("不等");
		}
	System.out.println(1 << 1);
		System.out.println("good:"+good);
		System.out.println("goods:"+goods);
	}

}

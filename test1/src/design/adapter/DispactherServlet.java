package design.adapter;

import java.util.ArrayList;
import java.util.List;

/*
*@data 2019/8/25
*@descrption 适配器模式
*
*/
public class DispactherServlet {
	List<HandlerAdapter> adapters = new ArrayList<HandlerAdapter>();

	public DispactherServlet() {
		adapters.add(new HandlerAdapter1());
		adapters.add(new HandlerAdapter2());
		adapters.add(new HandlerAdapter3());
	}
	public void doDispacterServlet(){
//		Controler con1 = new Controler1();
		Controler con1 = new Controler2();
		HandlerAdapter adapter = getAdapter(con1);
		adapter.handle(con1);
	}
	public HandlerAdapter getAdapter(Controler Controler) {
		for(HandlerAdapter adapter : adapters){
			if(adapter.supports(Controler) ){
				return adapter;
			}
		}
		return null;
	}
	public static void main(String[] args){
		new DispactherServlet().doDispacterServlet();
	}
	
	

}

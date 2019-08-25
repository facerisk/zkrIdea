package design.adapter;

public class HandlerAdapter1   implements HandlerAdapter,Controler {

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof Controler1);
		
	}

	@Override
	public void handle(Object handler) {
		((Controler1)handler).doHttpHandler();

	}

}

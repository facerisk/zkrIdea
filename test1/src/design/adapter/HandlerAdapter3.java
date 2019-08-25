package design.adapter;

public class HandlerAdapter3 implements HandlerAdapter {

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof Controler3);
		
	}

	@Override
	public void handle(Object handler) {
		((Controler3)handler).doHttpHandler();

	}

}

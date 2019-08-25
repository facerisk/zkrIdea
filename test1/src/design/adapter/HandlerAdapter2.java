package design.adapter;

public class HandlerAdapter2 implements HandlerAdapter {

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof Controler2);
		
	}

	@Override
	public void handle(Object handler) {
		((Controler2)handler).doHttpHandler();

	}

}

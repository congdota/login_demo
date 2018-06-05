package common;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Call DESTROY() method ");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Call init() method ");
	}

	@Override
	public String intercept(ActionInvocation actionInvo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before invocation.invoke().... ");
		String rs = actionInvo.invoke();
		System.out.println("After invocation.invoke()");
		return rs;
	}

}

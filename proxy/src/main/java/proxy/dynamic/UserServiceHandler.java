package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by lixinglin on 2018/9/21.
 * At 8:46
 */
public class UserServiceHandler implements InvocationHandler {
	private Object target;
	
	public UserServiceHandler(Object target) {
		this.target = target;
	}
	
	public Object getProxy() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("做了一些前置校验的工作等");
		
		Object result = method.invoke(target, args);
		System.out.println(String.format("我是%s,我永远:%s岁", args[0], result));
		
		//调用完毕后做一些数据的处理等
		System.out.println("做了一些数据的处理操作");
		return result;
	}
	
}

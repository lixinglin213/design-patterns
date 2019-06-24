package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Create by lixinglin on 2018/9/21.
 * At 8:50
 */
public class Client {
	public static void main(String[] args) {
		IUserService userService = new UserServiceImpl();
		
		Class<?>[] clazz = userService.getClass().getInterfaces();
		InvocationHandler h = new UserServiceHandler(userService);
		UserServiceHandler handler = new UserServiceHandler(userService);
//		IUserService userServiceProxy = (IUserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), h);
		IUserService userServiceProxy = (IUserService) handler.getProxy();
		userServiceProxy.getAge("lixl");
	}
}

package proxy.statical;

/**
 * Create by lixinglin on 2018/9/21.
 * At 8:56
 */
public class UserServiceProxy implements IUserService {
	
	private UserServiceImpl userService;
	
	public UserServiceProxy() {
		this.userService = new UserServiceImpl();
	}
	
	public UserServiceProxy(UserServiceImpl userService) {
		this.userService = userService;
	}
	
	@Override
	public Integer getAge(String name) {
		System.out.println("返回年龄之前先做一些前置校验的工作!");
		Integer age = userService.getAge(name);
		System.out.println(String.format("我是%s,我的年龄永远是：%s", name, age));
		return age;
	}
	
}

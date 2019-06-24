package proxy.dynamic;

/**
 * Create by lixinglin on 2018/9/21.
 * At 8:45
 */
public class UserServiceImpl implements IUserService {
	
	
	@Override
	public Integer getAge(String userId) {
		return 18;
	}
}

package prototype.deep;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by lixinglin on 2018/7/31.
 * At 8:58
 */
public class PrototypeManager {
	
	private Map<String, Prototype> map = new HashMap<>();
	
	public void register(String key, Prototype prototype) {
		map.put(key, prototype);
	}
	
	public Prototype create(String key) {
		Prototype prototype = (Prototype) map.get(key);
		return prototype.create();
	}
	
	
}

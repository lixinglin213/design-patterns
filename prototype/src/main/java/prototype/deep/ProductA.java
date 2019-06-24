package prototype.deep;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by lixinglin on 2018/7/31.
 * At 9:01
 */
public class ProductA extends Prototype implements Serializable {
	
	private List list = new ArrayList();
	
	public ProductA(List list) {
		this.list = list;
	}
	
	public List getList() {
		return list;
	}
	
	@Override
	Prototype create() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
	
}

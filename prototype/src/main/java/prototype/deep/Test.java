package prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用序列化反序列化实现深拷贝
 *
 * Create by lixinglin on 2018/7/31.
 * At 9:05
 */
public class Test {
	
	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		list.add("2");
		
		ProductA productA = new ProductA(list);
		
		PrototypeManager manager = new PrototypeManager();
		manager.register("1", new ProductA(list));
		
		ProductA cloneProductA = (ProductA) manager.create("1");
		System.out.println(cloneProductA.getList() == productA.getList());
	}
}

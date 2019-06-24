import java.util.List;

/**
 * Create by lixinglin on 2018/11/15.
 * At 18:58
 */
public class SortManager {
	private List<Integer> list;
	
	private SortingStrategy sortingStrategy;
	
	
	public SortManager(List<Integer> list, SortingStrategy sortingStrategy) {
		this.list = list;
		this.sortingStrategy = sortingStrategy;
	}
	
	public SortManager() {
	}
	
	public void sortList() {
		System.out.print("正在进行");
		sortingStrategy.sort(list);
	}
	
}

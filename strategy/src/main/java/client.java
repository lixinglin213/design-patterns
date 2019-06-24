import java.util.ArrayList;
import java.util.List;

/**
 * Create by lixinglin on 2018/11/15.
 * At 19:02
 */
public class client {
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		SortingStrategy sortingStrategy = new SwapSortStrategy();
		SortManager sort = new SortManager(list, sortingStrategy);
		sort.sortList();
		
	}
}

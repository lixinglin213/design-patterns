package builder.singleton;

/**
 * Create by lixinglin on 2018/7/29.
 * At 12:08
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void constructor() {
		builder.makeTitle("Title");
		builder.makeItems(new String[]{"item1", "item2"});
		builder.makeString("content");
		builder.build();
	}
}

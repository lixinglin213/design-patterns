package builder.common;

/**
 * Create by lixinglin on 2018/7/29.
 * At 12:21
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeItems(new String[]{"Item1", "Item2"});
		builder.makeString("这是一个特别好看的电影");
		builder.makeTitle("寻梦环游记");
		builder.build();
	}
	
}

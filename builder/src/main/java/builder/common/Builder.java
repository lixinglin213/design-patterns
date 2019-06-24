package builder.common;

/**
 * Create by lixinglin on 2018/7/29.
 * At 12:18
 */
public abstract class Builder {
	public abstract void makeTitle(String title);
	
	public abstract void makeString(String str);
	
	public abstract void makeItems(String [] items);
	
	public abstract void build();
	
}

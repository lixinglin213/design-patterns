package builder.common;

/**
 * Create by lixinglin on 2018/7/29.
 * At 12:28
 */
public class TextBuilder extends Builder {
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		buffer.append(title + "\n");
	}
	
	@Override
	public void makeString(String str) {
		buffer.append(str);
	}
	
	@Override
	public void makeItems(String[] items) {
		for (String str : items) {
			buffer.append(str);
		}
	}
	
	@Override
	public void build() {
		buffer.append("======OK=======");
	}
	
	public String getResult() {
		return buffer.toString();
	}
}

package builder.singleton;

/**
 * 构建Text风格的文档
 * Create by lixinglin on 2018/7/29.
 * At 12:55
 */
public class TextBuilder extends Builder {
	
	private TextBuilder() {
	}
	
	private static class SingletonHolder {
		private static final TextBuilder textBuilder = new TextBuilder();
	}
	
	public static TextBuilder getInstance() {
		return SingletonHolder.textBuilder;
	}
	
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		buffer.append(title + "\n");
	}
	
	@Override
	public void makeString(String str) {
		buffer.append(str + "\n");
	}
	
	@Override
	public void makeItems(String[] items) {
		for (String str : items) {
			buffer.append(str);
		}
	}
	
	@Override
	public void build() {
		buffer.append("=============构建text风格的文档完毕！===========");
	}
	
	public String getResult() {
		return buffer.toString();
	}
}

package builder.common;

/**
 * Create by lixinglin on 2018/7/29.
 * At 12:33
 */
public class Test {
	
	public static void main(String[] args) {
		TextBuilder textBuilder = new TextBuilder();
		Director director = new Director(textBuilder);
		director.construct();
		
		String result = textBuilder.getResult();
		System.out.println(result);
	}
	
}

package builder.singleton;

/**
 * Create by lixinglin on 2018/7/29.
 * At 13:03
 */
public class Test {
	public static void main(String[] args) {
		TextBuilder textBuilder = TextBuilder.getInstance();
		
		Director director = new Director(textBuilder);
		
		director.constructor();
		String result = textBuilder.getResult();
		System.out.println(result);
	}
}

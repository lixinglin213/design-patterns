package builder.simple;

/**
 * Create by lixinglin on 2018/7/29.
 * At 11:56
 */
public class Test {
	
	public static void main(String[] args) {
		
		Square square = new Square.Builder()
				.setColor("red")
				.setWidth(100)
				.setHeight(200)
				.build();
	}
	
}

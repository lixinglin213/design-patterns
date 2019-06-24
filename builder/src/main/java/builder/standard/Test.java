package builder.standard;

/**
 * Create by lixinglin on 2018/7/29.
 * At 18:14
 */
public class Test {
	public static void main(String[] args) {
		Director director = new Director();
		Person person = director.constructFullPerson(new ConcreteBuilder());
		System.out.println(person.getBody());
		
	}
}

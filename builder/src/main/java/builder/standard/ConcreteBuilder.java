package builder.standard;

/**
 * Create by lixinglin on 2018/7/29.
 * At 18:08
 */
public class ConcreteBuilder implements Builder {
	
	Person person;
	
	public ConcreteBuilder() {
		person = new Person();
	}
	
	@Override
	public void buildHeader() {
		person.setHead("创建了一个国产头");
	}
	
	@Override
	public void buildBody() {
		person.setBody("创建了一个国产身体");
	}
	
	@Override
	public void buildFoot() {
		person.setFoot("创建了一个香港脚");
	}
	
	@Override
	public Person buildPerson() {
		return person;
	}
}

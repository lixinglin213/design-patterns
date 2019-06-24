package builder.standard;

/**
 * 创建一个完整的人
 * Create by lixinglin on 2018/7/29.
 * At 18:11
 */
public class Director {
	
	public Person constructFullPerson(Builder concreteBuilder) {
		concreteBuilder.buildHeader();
		concreteBuilder.buildBody();
		concreteBuilder.buildFoot();
		Person person = concreteBuilder.buildPerson();
		return person;
	}
}

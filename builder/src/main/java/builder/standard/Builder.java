package builder.standard;

/**
 * Create by lixinglin on 2018/7/29.
 * At 18:06
 */
public interface Builder {
	
	void buildHeader();
	
	void buildBody();
	
	void buildFoot();
	
	Person buildPerson();
}

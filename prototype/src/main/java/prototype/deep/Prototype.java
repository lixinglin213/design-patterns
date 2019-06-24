package prototype.deep;

/**
 * Create by lixinglin on 2018/7/31.
 * At 8:55
 */
public abstract class Prototype implements Cloneable {
	
	abstract Prototype create();
	
	/**
	 * 重写clone。将浅复制更改为深复制
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

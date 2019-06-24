package composite;

/**
 * Create by lixinglin on 2018/8/31.
 * At 10:41
 */
public abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
}

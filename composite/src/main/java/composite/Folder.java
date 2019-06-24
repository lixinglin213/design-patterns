package composite;

import java.util.ArrayList;

/**
 * Create by lixinglin on 2018/8/31.
 * At 10:46
 */
public class Folder extends AbstractFile {
	
	
	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	
	private String name;
	
	public Folder(String name) {
		this.name = name;
	}
	
	@Override
	public void add(AbstractFile file) {
		fileList.add(file);
	}
	
	@Override
	public void remove(AbstractFile file) {
		fileList.remove(file);
	}
	
	@Override
	public AbstractFile getChild(int i) {
		return (AbstractFile) fileList.get(i);
	}
	
	@Override
	public void killVirus() {
		System.out.println("****对文件夹'" + name + "'进行杀毒");
		
		//递归调用成员构件的killVirus()方法
		for (Object obj : fileList) {
			((AbstractFile) obj).killVirus();
		}
	}
}

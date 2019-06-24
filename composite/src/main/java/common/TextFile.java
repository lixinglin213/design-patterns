package common;

/**
 * Create by lixinglin on 2018/8/31.
 * At 9:10
 */
public class TextFile {
	
	private String name;
	
	public TextFile(String name) {
		this.name = name;
	}
	
	public void killVirus() {
		System.out.println("模拟杀毒过程，正在对文件文件" + name + "进行杀毒");
	}
}

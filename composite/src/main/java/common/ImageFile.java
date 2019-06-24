package common;

/**
 * Create by lixinglin on 2018/8/31.
 * At 9:10
 */
public class ImageFile {
	
	private String name;
	
	public ImageFile(String name) {
		this.name = name;
	}
	
	public void killVirus() {
		System.out.println("模拟杀毒过程，正在对图像文件" + name + "进行杀毒");
	}
	
}

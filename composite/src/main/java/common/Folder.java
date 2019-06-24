package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by lixinglin on 2018/8/31.
 * At 9:13
 */
public class Folder {
	
	private String name;
	
	private List<Folder> folderList = new ArrayList<>();
	
	private List<ImageFile> imageList = new ArrayList<>();
	
	private List<TextFile> textList = new ArrayList<>();
	
	
	public Folder(String name) {
		this.name = name;
	}
	
	public void addFolder(Folder folder) {
		folderList.add(folder);
	}
	
	public void addImageFile(ImageFile image) {
		imageList.add(image);
	}
	
	public void addTextFile(TextFile text) {
		textList.add(text);
	}
	
	public void killVirus() {
		
		System.out.println("****对文件夹'" + name + "'进行杀毒");
		
		//如果是Folder类型的成员，递归调用Folder的killVirus()方法
		for(Object obj : folderList) {
			((Folder)obj).killVirus();
		}
		
		//如果是ImageFile类型的成员，调用ImageFile的killVirus()方法
		for(Object obj : imageList) {
			((ImageFile)obj).killVirus();
		}
		
		//如果是TextFile类型的成员，调用TextFile的killVirus()方法
		for(Object obj : textList) {
			((TextFile)obj).killVirus();
		}
	}
}

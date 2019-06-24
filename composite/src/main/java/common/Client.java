package common;

/**
 * Create by lixinglin on 2018/8/31.
 * At 9:23
 */
public class Client {
	public static void main(String[] args) {
		ImageFile imageOne = new ImageFile("imageOne");
		ImageFile imageTwo = new ImageFile("imageTwo");
		
		TextFile textOne = new TextFile("textOne");
		TextFile textTwo = new TextFile("textTwo");
		
		Folder imageFolder = new Folder("imageFolder");
		Folder textFolder = new Folder("textFolder");
		
		imageFolder.addImageFile(imageOne);
		imageFolder.addImageFile(imageTwo);
		textFolder.addTextFile(textOne);
		textFolder.addTextFile(textTwo);

		Folder folder = new Folder("folder");
		folder.addFolder(imageFolder);
		folder.addFolder(textFolder);
		folder.killVirus();
		
	}
}

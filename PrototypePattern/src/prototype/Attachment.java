package prototype;

import java.io.Serializable;

public class Attachment implements Serializable{

	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void download(){
		System.out.println("下载的文件名字为"+filename);
	}
}

package controller;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class Upload extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private File[] upload;
	private String[] uploadFileName;
	private String[] uploadContentType;
	
	public String execute() throws Exception{
		return SUCCESS;
	}

	public File[] getUpload() {
		return upload;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String[] getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	
	
}

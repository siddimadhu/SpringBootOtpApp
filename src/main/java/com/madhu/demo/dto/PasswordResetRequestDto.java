package com.madhu.demo.dto;

public class PasswordResetRequestDto {
	private String phonenumber;//destination
	private String userName;
	private String oneTimePassword;
	
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOneTimePassword() {
		return oneTimePassword;
	}
	public void setOneTimePassword(String oneTimePassword) {
		this.oneTimePassword = oneTimePassword;
	}
	public PasswordResetRequestDto(String phonenumber, String userName, String oneTimePassword) {
		super();
		this.phonenumber = phonenumber;
		this.userName = userName;
		this.oneTimePassword = oneTimePassword;
	}
	public PasswordResetRequestDto() {
		super();
	}

	

}

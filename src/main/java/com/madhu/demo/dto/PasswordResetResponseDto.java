package com.madhu.demo.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PasswordResetResponseDto {

	private otpStatus satus;

	private String message;

	

	public otpStatus getSatus() {
		return satus;
	}

	public void setSatus(otpStatus satus) {
		this.satus = satus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PasswordResetResponseDto(otpStatus satus, String message) {
		super();
		this.satus = satus;
		this.message = message;
	}

	public PasswordResetResponseDto() {
		super();
	}


	
	

}

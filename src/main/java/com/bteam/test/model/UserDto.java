package com.bteam.test.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

	private String userId;
	
	private String password;
	
	private String name;
	
	private String email;
	
	private String phoneNumber;
	
	private Long birth;
	
	private boolean admin=false;
	
	
}

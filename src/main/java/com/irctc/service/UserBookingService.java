package com.irctc.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irctc.entities.User;
import com.irctc.util.UserServiceUtil;

public class UserBookingService {

	private User user;
	
	private List<User> userList;
	
	private ObjectMapper objectMapper= new ObjectMapper();
	
	private static final String USER_PATH="/Users/sudipmanjarekar/Documents/workspace-spring-tool-suite-4-4.20.0.RELEASE/IRCTC_Application/src/main/java/localDB/Users.json"; 
	
	public UserBookingService(User user1) throws IOException {
		this.user = user1;
		File users = new File(USER_PATH);
		userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
	}
	
	public Boolean loginUser() {
		Optional<User> foundUser = userList.stream().filter(user1 -> {
			return user1.getName().equalsIgnoreCase(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
		}).findFirst();
		return foundUser.isPresent();
	}
}

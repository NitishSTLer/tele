package com.telecom.services.user;


import com.telecom.dto.SignupRequest;
import com.telecom.dto.UserDto;

public interface UserService {

     Boolean hasUserWithEmail(String email);

     UserDto createUser(SignupRequest signupRequest) throws Exception;

}

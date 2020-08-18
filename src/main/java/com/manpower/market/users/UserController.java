/**
 * 
 */
package com.manpower.market.users;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manpower.market.model.UserRequestModel;
import com.manpower.market.model.UserResponseModel;

/**
 * @author braje
 *
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/home")
	public String getHome() {
		log.info(" ---getHome --");
		return "getHome";
	}
	@GetMapping("/users")
	public ResponseEntity<UserResponseModel> getUsers() {
		log.info(" ---getUsers --");
		return new ResponseEntity<UserResponseModel>(new UserResponseModel(), HttpStatus.OK);
	}
	
	@GetMapping("/usres/{userId}")
	public ResponseEntity<UserResponseModel> getUser(@PathParam(value = "userId") String userId) {
		log.info(" ---getUser --");
		return new ResponseEntity<UserResponseModel>(new UserResponseModel(), HttpStatus.OK);
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<UserResponseModel> createUser(UserRequestModel userRequest) {
		log.info(" ---getUser --");
		return new ResponseEntity<UserResponseModel>(new UserResponseModel(), HttpStatus.OK);
	}
	
	@PutMapping("/editUser/{userId}")
	public ResponseEntity<UserResponseModel> editUsers(@PathParam(value = "userId") String userId,UserRequestModel userRequest) {
		log.info(" ---editUsers --");
		return new ResponseEntity<UserResponseModel>(new UserResponseModel(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<UserResponseModel> delteUser(@PathParam(value = "userId") String userId,UserRequestModel userRequest) {
		log.info(" ---delteUser --");
		return new ResponseEntity<UserResponseModel>(new UserResponseModel(), HttpStatus.OK);
	}
}

package com.mandala.firstmongodb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandala.firstmongodb.model.UserProfile;
import com.mandala.firstmongodb.repositry.UserProfileRepository;

@RestController
@RequestMapping("/userprofile")
public class UserProfileController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserProfileRepository dbrepo;
	
	@GetMapping
	public List<UserProfile> getUserProfiles() {
		log.info("getUserProfiles() method called.");
		return dbrepo.findAll();
	}
	
//	@GetMapping("/{firstname}")
//	public UserProfile getUserProfileFirstname(@PathVariable String firstname) {
//		return dbrepo.findByFirstname(firstname);
//	}
	
	@PostMapping
	public UserProfile insertUserProfile(@RequestBody UserProfile user) {
		log.info("insertUserProfile() method called with values " + user.toString());
		return dbrepo.save(user);
	}
}

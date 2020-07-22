package com.mandala.firstmongodb.repositry;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mandala.firstmongodb.model.UserProfile;

public interface UserProfileRepository extends MongoRepository<UserProfile, Id> {
	//UserProfile findByFirstname(String firstname);
}

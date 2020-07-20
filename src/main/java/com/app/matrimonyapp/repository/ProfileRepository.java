package com.app.matrimonyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.matrimonyapp.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>{

	 Profile findByProfileId(Integer interestedInProfileId);
	 
	 List<Profile> findAllByLocation(String preferenceLocation);

	
}

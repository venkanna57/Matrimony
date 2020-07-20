package com.app.matrimonyapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.matrimonyapp.entity.ProfileInterest;

@Repository
public interface ProfileInterestRepository extends JpaRepository<ProfileInterest, Integer>{

	List<ProfileInterest> findByProfileId(Integer profileId);

	List<ProfileInterest> findByInterestedInProfileId(Integer interestedInProfileId);

	
}

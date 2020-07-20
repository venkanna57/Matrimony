package com.app.matrimonyapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProfileInterest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer profileInterestId;
	
	private Integer profileId;
	
	private Integer interestedInProfileId;

	public Integer getProfileInterestId() {
		return profileInterestId;
	}

	public void setProfileInterestId(Integer profileInterestId) {
		this.profileInterestId = profileInterestId;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Integer getInterestedInProfileId() {
		return interestedInProfileId;
	}

	public void setInterestedInProfileId(Integer interestedInProfileId) {
		this.interestedInProfileId = interestedInProfileId;
	}
	
}

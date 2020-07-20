package com.app.matrimonyapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Preference {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer preferenceId;
	
	private Integer profileId;
	
	private String preferenceGender;
	
	private Integer preferenceAge;
	
	private String preferenceLanguage;
	
	private String preferencelocation;

	public Integer getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(Integer preferenceId) {
		this.preferenceId = preferenceId;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getPreferenceGender() {
		return preferenceGender;
	}

	public void setPreferenceGender(String preferenceGender) {
		this.preferenceGender = preferenceGender;
	}

	public Integer getPreferenceAge() {
		return preferenceAge;
	}

	public void setPreferenceAge(Integer preferenceAge) {
		this.preferenceAge = preferenceAge;
	}

	public String getPreferenceLanguage() {
		return preferenceLanguage;
	}

	public void setPreferenceLanguage(String preferenceLanguage) {
		this.preferenceLanguage = preferenceLanguage;
	}

	public String getPreferencelocation() {
		return preferencelocation;
	}

	public void setPreferencelocation(String preferencelocation) {
		this.preferencelocation = preferencelocation;
	}

	
}

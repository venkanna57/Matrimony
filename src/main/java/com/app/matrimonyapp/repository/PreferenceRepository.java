package com.app.matrimonyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.matrimonyapp.entity.Preference;
import com.app.matrimonyapp.entity.Profile;
@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Integer> {
	Preference findByProfileId(Profile profile);
}

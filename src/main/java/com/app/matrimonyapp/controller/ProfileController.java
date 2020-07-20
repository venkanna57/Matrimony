package com.app.matrimonyapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.matrimonyapp.dto.DefaultProfileDto;
import com.app.matrimonyapp.dto.ProfileReqDto;
import com.app.matrimonyapp.entity.Profile;
import com.app.matrimonyapp.service.SearchProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
private static Logger logger = LoggerFactory.getLogger(ProfileController.class);
	
    @Autowired 
    SearchProfileService searchProfileService;
	
	@GetMapping("")
	public ResponseEntity<List<DefaultProfileDto>> getDefaultProfile(@RequestParam int profileId){
		List<DefaultProfileDto> defaultProfileDto = searchProfileService.getDefaultProfile(profileId);
	
		return new ResponseEntity<>(defaultProfileDto, HttpStatus.OK);
	}
	
	@PostMapping("/search")
	public ResponseEntity<List<DefaultProfileDto>> getProfile(@RequestBody DefaultProfileDto defaultReqProfileDto){
		List<DefaultProfileDto> defaultProfileDto = searchProfileService.getProfile(defaultReqProfileDto);
	
		return new ResponseEntity<>(defaultProfileDto, HttpStatus.OK);
	}
	
}

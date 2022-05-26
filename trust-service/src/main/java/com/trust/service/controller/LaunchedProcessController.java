package com.trust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trust.service.controller.dto.LaunchedProcessDto;
import com.trust.service.controller.dto.LaunchedProcessStatusDto;
import com.trust.service.service.LaunchedProcessService;

@RestController
@RequestMapping(value = "/launched_processes")
public class LaunchedProcessController {
	
	private final LaunchedProcessService launchedProcessService;
	
	@Autowired
	public LaunchedProcessController(LaunchedProcessService launchedProcessService) {
		this.launchedProcessService = launchedProcessService;
	}
	
	@PostMapping
	public ResponseEntity postLaunchedProcess(@RequestHeader("Authorization") String apiKey,
			@RequestBody LaunchedProcessDto launchedProcessDto) {
		launchedProcessService.launchProcess(apiKey, launchedProcessDto);
		return ResponseEntity.noContent().build();

	}
	
	@GetMapping
	public ResponseEntity getLaunchedProcessStatus(@RequestHeader("Authorization") String apiKey,
			@RequestParam String cbpId, @RequestParam String ipId) {
		
		LaunchedProcessStatusDto launchedProcessStatusDto = launchedProcessService.getLaunchedProcessStatus(apiKey, cbpId, ipId);
		return new ResponseEntity(launchedProcessStatusDto, HttpStatus.OK);
	}
}

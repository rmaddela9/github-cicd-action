package com.cicd.actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class CicdController {
	
@GetMapping("/message")
public String message() {
	return "CICD demo message! and changed the message now!";
	
}

}

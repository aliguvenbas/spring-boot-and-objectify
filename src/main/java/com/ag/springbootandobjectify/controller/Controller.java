package com.ag.springbootandobjectify.controller;

import com.ag.springbootandobjectify.model.Airplane;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

	@PostMapping("/add")
	public void addAirplane(@RequestBody Airplane airplaneDTO) {

	}

	@GetMapping("/getFleet")
	public List<Airplane> getFleet() {
		return null;
	}

	@GetMapping("getByRegistrationId")
	public Airplane getByRegistrationId() {
		return null;
	}
}

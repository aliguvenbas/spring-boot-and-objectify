package com.ag.springbootandobjectify.controller;

import com.ag.springbootandobjectify.model.Airplane;
import com.ag.springbootandobjectify.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class Controller {

	private AirplaneService service;

	@Autowired
	public Controller(AirplaneService service) {
		this.service = service;
	}

	@PostMapping("/add")
	public void addAirplane(@RequestBody Airplane airplane) {
		System.out.println(airplane.toString());
		airplane.setId(UUID.randomUUID().toString());
		service.addAirplane(airplane);
	}

	@GetMapping("/getFleet")
	public List<Airplane> getFleet() {
		return service.getFleet();
	}

	@GetMapping("/getAirplane")
	public Airplane getByRegistrationId(@RequestParam String id) {
		return service.getByRegistrationId(id);
	}
}

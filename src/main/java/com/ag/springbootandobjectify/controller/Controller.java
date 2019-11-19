package com.ag.springbootandobjectify.controller;

import com.ag.springbootandobjectify.model.Airplane;
import com.ag.springbootandobjectify.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public void addAirplane(@RequestBody Airplane airplaneDTO) {

	}

	@GetMapping("/add")
	public void addAirplaneGet() {
		Airplane airplane = Airplane.builder().id(UUID.randomUUID().toString()).name("Çanakkale").age(2).registration("TC-JDV").type("Boeing-737").build();
		service.addAirplane(airplane);
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

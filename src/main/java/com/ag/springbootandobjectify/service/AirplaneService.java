package com.ag.springbootandobjectify.service;

import com.ag.springbootandobjectify.model.Airplane;
import com.ag.springbootandobjectify.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService {
	private AirplaneRepository airplaneRepository;

	@Autowired
	public AirplaneService(AirplaneRepository airplaneRepository) {
		this.airplaneRepository = airplaneRepository;
	}

	public void addAirplane(Airplane airplane) {
		airplaneRepository.addAirplane(airplane);
	}

	public List<Airplane> getFleet() {
		return airplaneRepository.getFleet();
	}

	public Airplane getByRegistrationId() {
		return airplaneRepository.getByRegistrationId();
	}
}

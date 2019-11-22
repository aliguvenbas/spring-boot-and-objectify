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
		List<Airplane> airplaneList = airplaneRepository.getFleet();
		airplaneList.stream().forEach(airplane -> System.out.println("airplane id:" + airplane.getId() + " name:" + airplane.getName()));
		return airplaneList;
	}

	public Airplane getByRegistrationId(String id) {
		return airplaneRepository.getByRegistrationId(id);
	}
}

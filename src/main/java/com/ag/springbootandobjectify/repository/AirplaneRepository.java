package com.ag.springbootandobjectify.repository;

import com.ag.springbootandobjectify.model.Airplane;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AirplaneRepository {

	public void addAirplane(Airplane airplane) {
		ObjectifyRegistry.ofy().save().entity(airplane).now();
	}

	public List<Airplane> getFleet() {
		ObjectifyRegistry.ofy().load().type(Airplane.class).list().stream().forEach(airplane -> System.out.println("airplane id:" + airplane.getId() + " name:" + airplane.getName()));
		return null;
	}

	public Airplane getByRegistrationId() {
		return null;
	}
}

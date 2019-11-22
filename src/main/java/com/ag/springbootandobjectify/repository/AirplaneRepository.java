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
		return ObjectifyRegistry.ofy().load().type(Airplane.class).list();

	}

	public Airplane getByRegistrationId(String id) {
		return ObjectifyRegistry.ofy().load().type(Airplane.class).id(id).now();
	}
}

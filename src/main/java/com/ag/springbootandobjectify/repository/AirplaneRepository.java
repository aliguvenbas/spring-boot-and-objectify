package com.ag.springbootandobjectify.repository;

import com.ag.springbootandobjectify.model.Airplane;
import org.springframework.stereotype.Repository;

import static com.googlecode.objectify.ObjectifyService.ofy;

@Repository
public class AirplaneRepository {

	public void addAirplane(Airplane airplane) {
		ofy().save().entity(airplane).now();

	}
}

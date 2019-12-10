package com.ag.springbootandobjectify.repository;

import com.ag.springbootandobjectify.model.Airplane;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.KeyFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AirplaneRepository {

	// Create an authorized Datastore service using Application Default Credentials.
	private final Datastore datastore = DatastoreOptions.getDefaultInstance().getService();

	private final KeyFactory keyFactory = datastore.newKeyFactory().setKind("Airplane");

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

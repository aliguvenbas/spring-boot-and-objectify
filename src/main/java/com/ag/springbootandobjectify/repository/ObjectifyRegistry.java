package com.ag.springbootandobjectify.repository;

import com.ag.springbootandobjectify.model.Airplane;
import com.google.cloud.datastore.DatastoreOptions;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class ObjectifyRegistry {

	static {
		ObjectifyService.register(Airplane.class);
	}

	public void initDataStoreEmulator() {
		ObjectifyService.init(new ObjectifyFactory(
				DatastoreOptions.newBuilder()
						.setHost("http://localhost:8484")
						.setProjectId("my-project")
						.build()
						.getService()
		));
	}
}

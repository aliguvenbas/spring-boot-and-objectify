package com.ag.springbootandobjectify.repository;

import com.google.cloud.datastore.DatastoreOptions;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class DataStoreEmulatorManger {

	public static void initDataStoreEmulator() {
		ObjectifyService.init(new ObjectifyFactory(
				DatastoreOptions.newBuilder()
						.setHost("http://localhost:8484")
						.setProjectId("project-airplane-fleet")
						.build()
						.getService()
		));
	}
}

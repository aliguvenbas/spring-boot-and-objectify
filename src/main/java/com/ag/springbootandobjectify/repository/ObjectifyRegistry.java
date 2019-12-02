package com.ag.springbootandobjectify.repository;

import com.ag.springbootandobjectify.model.Airplane;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class ObjectifyRegistry {

	static {
		ObjectifyService.register(Airplane.class);
	}

	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}
}

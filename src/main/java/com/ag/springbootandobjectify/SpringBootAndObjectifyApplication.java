package com.ag.springbootandobjectify;

import com.ag.springbootandobjectify.repository.DataStoreEmulatorManger;
import com.ag.springbootandobjectify.repository.ObjectifyRegistry;
import com.googlecode.objectify.ObjectifyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAndObjectifyApplication {

	public static void main(String[] args) {
//		DataStoreEmulatorManger.initDataStoreEmulator();
		ObjectifyService.init();
		SpringApplication.run(SpringBootAndObjectifyApplication.class, args);
	}

}

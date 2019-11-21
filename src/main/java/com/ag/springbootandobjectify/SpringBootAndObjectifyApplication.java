package com.ag.springbootandobjectify;

import com.ag.springbootandobjectify.repository.DataStoreEmulatorManger;
import com.ag.springbootandobjectify.repository.ObjectifyRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAndObjectifyApplication {

	public static void main(String[] args) {
		DataStoreEmulatorManger.initDataStoreEmulator();
		SpringApplication.run(SpringBootAndObjectifyApplication.class, args);
	}

}

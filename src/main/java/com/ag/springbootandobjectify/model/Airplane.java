package com.ag.springbootandobjectify.model;

import com.googlecode.objectify.annotation.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
public class Airplane {
	String type;
	String name;
	int age;
	String registration;
}

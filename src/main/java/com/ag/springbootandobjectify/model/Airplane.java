package com.ag.springbootandobjectify.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Builder
@AllArgsConstructor
public class Airplane {
	@Id String id;
	String type;
	String name;
	int age;
	String registration;
}

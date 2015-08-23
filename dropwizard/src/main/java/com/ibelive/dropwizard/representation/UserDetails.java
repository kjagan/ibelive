package com.ibelive.dropwizard.representation;

import io.dropwizard.jackson.JsonSnakeCase;

/**
 * @author JK035766
 *
 */
@JsonSnakeCase
public class UserDetails {
	private final int id;
	private String name;
	private float height;
	private float weight;
	
	public UserDetails() {
		this.id = 0;
		this.name = null;
		this.height = 0;
		this.weight = 0;
	}
	
	public UserDetails(int id,String name,float height,float weight){
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
	
}

package com.ibelive.dropwizard;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author JK035766
 *
 */
public class IbeliveConfiguration extends Configuration{
	@JsonProperty
	private DataSourceFactory database = new DataSourceFactory();

	public DataSourceFactory getDataSourceFactory() {
		return database;
	}
}

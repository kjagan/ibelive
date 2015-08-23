package com.ibelive.dropwizard;

import org.skife.jdbi.v2.DBI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibelive.dropwizard.resources.ActiveAdminCommentResource;
import com.ibelive.dropwizard.resources.UserDetailsResource;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author JK035766
 *
 */
public class IbeliveApplication extends Application<IbeliveConfiguration>{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IbeliveApplication.class);
	
	@Override
	public void initialize(Bootstrap<IbeliveConfiguration> b) {}

	@Override
	public void run(IbeliveConfiguration config, Environment env)
			throws Exception {
		// Create a DBI factory and build a JDBI instance
		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory
		.build(env, config.getDataSourceFactory(), "mysql");
		// Add the resource to the environment
		env.jersey().register(new UserDetailsResource(jdbi));	
		env.jersey().register(new ActiveAdminCommentResource(jdbi));
	}
	
	public static void main(String[] args) throws Exception {
		new IbeliveApplication().run(args);
	}
    
}
 
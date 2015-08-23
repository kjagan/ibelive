package com.ibelive.dropwizard.dao;

import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import com.ibelive.dropwizard.dao.mappers.UserDetailMapper;
import com.ibelive.dropwizard.representation.UserDetails;

/**
 * @author JK035766
 *
 */
public interface UserDetailsDao {
	
	@Mapper(UserDetailMapper.class)
	@SqlQuery("select * from userdetails where id = :id")
	UserDetails getContactById(@Bind("id") int id);
	
	@GetGeneratedKeys
    @SqlUpdate("insert into userdetails (id, name, height, weight) values (NULL, :firstName, :lastName, :phone)")
    int createUser(@Bind("firstName") String firstName, @Bind("lastName") Float lastName, @Bind("phone") Float phone);
	
}

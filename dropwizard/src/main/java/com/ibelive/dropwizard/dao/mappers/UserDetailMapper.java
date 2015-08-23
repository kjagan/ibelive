package com.ibelive.dropwizard.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.ibelive.dropwizard.representation.UserDetails;

/**
 * @author JK035766
 *
 */
public class UserDetailMapper implements ResultSetMapper<UserDetails>{

	public UserDetails map(int index, ResultSet res, StatementContext stmtCtx)
			throws SQLException {
		// TODO Auto-generated method stub
		return new UserDetails(res.getInt("id"),res.getString("name"),res.getFloat("height"),res.getFloat("weight"));
	}

}

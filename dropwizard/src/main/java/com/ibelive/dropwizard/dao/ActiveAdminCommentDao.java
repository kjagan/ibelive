/**
 * 
 */
package com.ibelive.dropwizard.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import com.ibelive.dropwizard.dao.mappers.ActiveAdminCommentMapper;
import com.ibelive.dropwizard.representation.ActiveAdminComment;


/**
 * @author JK035766
 *
 */
public interface ActiveAdminCommentDao {
	
	@Mapper(ActiveAdminCommentMapper.class)
	@SqlQuery("select * from active_admin_comments where id = :id")
	ActiveAdminComment getActiveAdminCommentById(@Bind("id") int id);

}

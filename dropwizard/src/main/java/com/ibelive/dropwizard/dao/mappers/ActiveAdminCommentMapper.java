package com.ibelive.dropwizard.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.ibelive.dropwizard.representation.ActiveAdminComment;

public class ActiveAdminCommentMapper implements ResultSetMapper<ActiveAdminComment>{

	public ActiveAdminComment map(int index, ResultSet res, StatementContext stmtCtx)
			throws SQLException {
		// TODO Auto-generated method stub
		ActiveAdminComment activeAdminComment = new ActiveAdminComment();
		activeAdminComment.setId(res.getInt("id"));
		activeAdminComment.setAuthorId(res.getInt("author_id"));
		activeAdminComment.setAuthorType(res.getString("author_type"));
		activeAdminComment.setBody(res.getString("body"));
		activeAdminComment.setCreatedAt(res.getDate("created_at"));
		activeAdminComment.setNamespace(res.getString("namespace"));
		activeAdminComment.setResourceId(res.getString("resource_id"));
		activeAdminComment.setResourceType(res.getString("resource_type"));
		activeAdminComment.setUpdatedAt(res.getDate("updated_at"));
		return activeAdminComment;
	}
}

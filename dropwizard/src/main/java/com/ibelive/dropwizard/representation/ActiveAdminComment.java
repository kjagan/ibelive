package com.ibelive.dropwizard.representation;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the active_admin_comments database table.
 * 
 */
public class ActiveAdminComment implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int id;

	private int author_id;

	private String authorType;

	private String body;

	private Date createdAt;

	private String namespace;

	private String resourceId;

	private String resourceType;

	private Date updatedAt;

	public ActiveAdminComment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAuthorId() {
		return this.author_id;
	}

	public void setAuthorId(int author_id) {
		this.author_id = author_id;
	}

	public String getAuthorType() {
		return this.authorType;
	}

	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
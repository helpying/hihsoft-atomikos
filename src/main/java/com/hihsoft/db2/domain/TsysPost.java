/**
 * <p> Title: </p>
 * <p> Description:</p>
 * <p> Copyright: Copyright (c) 2014 </p>
 * <p> Company:hihsoft.co.,ltd </p>
 *
 * @author zhujw
 * @version 1.0
 */

package com.hihsoft.db2.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.hihsoft.framework.core.baseclass.domain.BaseDomain;

public class TsysPost extends BaseDomain {
	private static final long serialVersionUID = 5454155825314635342L;

	// alias
	public static final String TABLE_ALIAS = "岗位表";
	public static final String ALIAS_POST_ID = "岗位ID";
	public static final String ALIAS_POST_NAME = "岗位名称";
	public static final String ALIAS_REMARK = "岗位描述";
	public static final String ALIAS_POST_TYPE = "岗位类别";
	public static final String ALIAS_PARENT_POSTID = "父岗位ID";

	/**
	 * 岗位ID db_column: POST_ID
	 */
	private java.lang.String postId;
	/**
	 * 岗位名称 db_column: POST_NAME
	 */
	private java.lang.String postName;
	/**
	 * 岗位描述 db_column: REMARK
	 */
	private java.lang.String remark;
	/**
	 * 岗位类别 db_column: POST_TYPE
	 */
	private java.lang.String postType;
	/**
	 * 父岗位ID db_column: PARENT_POSTID
	 */
	private java.lang.String parentPostid;

	// columns END

	public TsysPost() {
	}

	public TsysPost(java.lang.String postId) {
		this.postId = postId;
	}

	public void setPostId(java.lang.String value) {
		this.postId = value;
	}

	public java.lang.String getPostId() {
		return this.postId;
	}

	public void setPostName(java.lang.String value) {
		this.postName = value;
	}

	public java.lang.String getPostName() {
		return this.postName;
	}

	public void setRemark(java.lang.String value) {
		this.remark = value;
	}

	public java.lang.String getRemark() {
		return this.remark;
	}

	public void setPostType(java.lang.String value) {
		this.postType = value;
	}

	public java.lang.String getPostType() {
		return this.postType;
	}

	public void setParentPostid(java.lang.String value) {
		this.parentPostid = value;
	}

	public java.lang.String getParentPostid() {
		return this.parentPostid;
	}

	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("PostId", getPostId())
				.append("PostName", getPostName())
				.append("Remark", getRemark())
				.append("PostType", getPostType())
				.append("ParentPostid", getParentPostid()).toString();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getPostId()).toHashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof TsysPost == false)
			return false;
		if (this == obj)
			return true;
		TsysPost other = (TsysPost) obj;
		return new EqualsBuilder().append(getPostId(), other.getPostId())
				.isEquals();
	}
}

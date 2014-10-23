/**
 * <p> Title: </p>
 * <p> Description:</p>
 * <p> Copyright: Copyright (c) 2014 </p>
 * <p> Company:hihsoft.co.,ltd </p>
 *
 * @author zhujw
 * @version 1.0
 */

package com.hihsoft.db1.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.hihsoft.framework.core.baseclass.domain.BaseDomain;
public class TsysApp extends BaseDomain{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "多系统、多应用管理";
	public static final String ALIAS_APP_ID = "appId";
	public static final String ALIAS_APP_NAME = "应用名称";
	public static final String ALIAS_APP_ICON = "应用图标";
	public static final String ALIAS_ORDER_NO = "排序号";
	public static final String ALIAS_APP_PATH = "应用访问路径";
	public static final String ALIAS_APP_SHORTNAME = "应用简称";
	

    /**
     * appId       db_column: APP_ID 
     */	
	private java.lang.String appId;
    /**
     * 应用名称       db_column: APP_NAME 
     */	
	private java.lang.String appName;
    /**
     * 应用图标       db_column: APP_ICON 
     */	
	private java.lang.String appIcon;
    /**
     * 排序号       db_column: ORDER_NO 
     */	
	private java.lang.Integer orderNo;
    /**
     * 应用访问路径       db_column: APP_PATH 
     */	
	private java.lang.String appPath;
    /**
     * 应用简称       db_column: APP_SHORTNAME 
     */	
	private java.lang.String appShortname;

	public TsysApp(){
	}

	public TsysApp(
		java.lang.String appId
	){
		this.appId = appId;
	}

	public void setAppId(java.lang.String value) {
		this.appId = value;
	}
	
	public java.lang.String getAppId() {
		return this.appId;
	}
	public void setAppName(java.lang.String value) {
		this.appName = value;
	}
	
	public java.lang.String getAppName() {
		return this.appName;
	}
	public void setAppIcon(java.lang.String value) {
		this.appIcon = value;
	}
	
	public java.lang.String getAppIcon() {
		return this.appIcon;
	}
	public void setOrderNo(java.lang.Integer value) {
		this.orderNo = value;
	}
	
	public java.lang.Integer getOrderNo() {
		return this.orderNo;
	}
	public void setAppPath(java.lang.String value) {
		this.appPath = value;
	}
	
	public java.lang.String getAppPath() {
		return this.appPath;
	}
	public void setAppShortname(java.lang.String value) {
		this.appShortname = value;
	}
	
	public java.lang.String getAppShortname() {
		return this.appShortname;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("AppId",getAppId())
			.append("AppName",getAppName())
			.append("AppIcon",getAppIcon())
			.append("OrderNo",getOrderNo())
			.append("AppPath",getAppPath())
			.append("AppShortname",getAppShortname())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getAppId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TsysApp == false) return false;
		if(this == obj) return true;
		TsysApp other = (TsysApp)obj;
		return new EqualsBuilder()
			.append(getAppId(),other.getAppId())
			.isEquals();
	}
}


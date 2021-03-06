/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.Dependent;
import com.rknowsys.eapp.hrm.model.DependentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Dependent service. Represents a row in the &quot;hrm_Dependent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.DependentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DependentImpl}.
 * </p>
 *
 * @author rknowsys
 * @see DependentImpl
 * @see com.rknowsys.eapp.hrm.model.Dependent
 * @see com.rknowsys.eapp.hrm.model.DependentModel
 * @generated
 */
public class DependentModelImpl extends BaseModelImpl<Dependent>
	implements DependentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dependent model instance should use the {@link com.rknowsys.eapp.hrm.model.Dependent} interface instead.
	 */
	public static final String TABLE_NAME = "hrm_Dependent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dependentId", Types.BIGINT },
			{ "employeeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "relationship", Types.VARCHAR },
			{ "dateOfBirth", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table hrm_Dependent (dependentId LONG not null primary key,employeeId LONG,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,relationship VARCHAR(75) null,dateOfBirth DATE null)";
	public static final String TABLE_SQL_DROP = "drop table hrm_Dependent";
	public static final String ORDER_BY_JPQL = " ORDER BY dependent.dependentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY hrm_Dependent.dependentId ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.Dependent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.Dependent"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.Dependent"),
			true);
	public static long DEPENDENTID_COLUMN_BITMASK = 1L;
	public static long EMPLOYEEID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.Dependent"));

	public DependentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dependentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDependentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dependentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Dependent.class;
	}

	@Override
	public String getModelClassName() {
		return Dependent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dependentId", getDependentId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("relationship", getRelationship());
		attributes.put("dateOfBirth", getDateOfBirth());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dependentId = (Long)attributes.get("dependentId");

		if (dependentId != null) {
			setDependentId(dependentId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String relationship = (String)attributes.get("relationship");

		if (relationship != null) {
			setRelationship(relationship);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}
	}

	@Override
	public long getDependentId() {
		return _dependentId;
	}

	@Override
	public void setDependentId(long dependentId) {
		_columnBitmask |= DEPENDENTID_COLUMN_BITMASK;

		if (!_setOriginalDependentId) {
			_setOriginalDependentId = true;

			_originalDependentId = _dependentId;
		}

		_dependentId = dependentId;
	}

	public long getOriginalDependentId() {
		return _originalDependentId;
	}

	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

		if (!_setOriginalEmployeeId) {
			_setOriginalEmployeeId = true;

			_originalEmployeeId = _employeeId;
		}

		_employeeId = employeeId;
	}

	public long getOriginalEmployeeId() {
		return _originalEmployeeId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getRelationship() {
		if (_relationship == null) {
			return StringPool.BLANK;
		}
		else {
			return _relationship;
		}
	}

	@Override
	public void setRelationship(String relationship) {
		_relationship = relationship;
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Dependent.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Dependent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Dependent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DependentImpl dependentImpl = new DependentImpl();

		dependentImpl.setDependentId(getDependentId());
		dependentImpl.setEmployeeId(getEmployeeId());
		dependentImpl.setGroupId(getGroupId());
		dependentImpl.setCompanyId(getCompanyId());
		dependentImpl.setUserId(getUserId());
		dependentImpl.setCreateDate(getCreateDate());
		dependentImpl.setModifiedDate(getModifiedDate());
		dependentImpl.setName(getName());
		dependentImpl.setRelationship(getRelationship());
		dependentImpl.setDateOfBirth(getDateOfBirth());

		dependentImpl.resetOriginalValues();

		return dependentImpl;
	}

	@Override
	public int compareTo(Dependent dependent) {
		long primaryKey = dependent.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Dependent)) {
			return false;
		}

		Dependent dependent = (Dependent)obj;

		long primaryKey = dependent.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		DependentModelImpl dependentModelImpl = this;

		dependentModelImpl._originalDependentId = dependentModelImpl._dependentId;

		dependentModelImpl._setOriginalDependentId = false;

		dependentModelImpl._originalEmployeeId = dependentModelImpl._employeeId;

		dependentModelImpl._setOriginalEmployeeId = false;

		dependentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Dependent> toCacheModel() {
		DependentCacheModel dependentCacheModel = new DependentCacheModel();

		dependentCacheModel.dependentId = getDependentId();

		dependentCacheModel.employeeId = getEmployeeId();

		dependentCacheModel.groupId = getGroupId();

		dependentCacheModel.companyId = getCompanyId();

		dependentCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dependentCacheModel.createDate = createDate.getTime();
		}
		else {
			dependentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dependentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dependentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dependentCacheModel.name = getName();

		String name = dependentCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			dependentCacheModel.name = null;
		}

		dependentCacheModel.relationship = getRelationship();

		String relationship = dependentCacheModel.relationship;

		if ((relationship != null) && (relationship.length() == 0)) {
			dependentCacheModel.relationship = null;
		}

		Date dateOfBirth = getDateOfBirth();

		if (dateOfBirth != null) {
			dependentCacheModel.dateOfBirth = dateOfBirth.getTime();
		}
		else {
			dependentCacheModel.dateOfBirth = Long.MIN_VALUE;
		}

		return dependentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{dependentId=");
		sb.append(getDependentId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", relationship=");
		sb.append(getRelationship());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.Dependent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dependentId</column-name><column-value><![CDATA[");
		sb.append(getDependentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relationship</column-name><column-value><![CDATA[");
		sb.append(getRelationship());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Dependent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Dependent.class
		};
	private long _dependentId;
	private long _originalDependentId;
	private boolean _setOriginalDependentId;
	private long _employeeId;
	private long _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _relationship;
	private Date _dateOfBirth;
	private long _columnBitmask;
	private Dependent _escapedModel;
}
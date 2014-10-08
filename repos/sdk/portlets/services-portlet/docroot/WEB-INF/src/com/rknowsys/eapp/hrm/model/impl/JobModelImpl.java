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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.Job;
import com.rknowsys.eapp.hrm.model.JobContractDetailsBlobModel;
import com.rknowsys.eapp.hrm.model.JobModel;
import com.rknowsys.eapp.hrm.service.JobLocalServiceUtil;

import java.io.Serializable;

import java.sql.Blob;
import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Job service. Represents a row in the &quot;hrm_Job&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.JobModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobImpl}.
 * </p>
 *
 * @author rknowsys
 * @see JobImpl
 * @see com.rknowsys.eapp.hrm.model.Job
 * @see com.rknowsys.eapp.hrm.model.JobModel
 * @generated
 */
public class JobModelImpl extends BaseModelImpl<Job> implements JobModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a job model instance should use the {@link com.rknowsys.eapp.hrm.model.Job} interface instead.
	 */
	public static final String TABLE_NAME = "hrm_Job";
	public static final Object[][] TABLE_COLUMNS = {
			{ "jobId", Types.BIGINT },
			{ "jobTitleId", Types.BIGINT },
			{ "jobCategoryId", Types.BIGINT },
			{ "subUnitId", Types.BIGINT },
			{ "locationId", Types.BIGINT },
			{ "employmentStatusId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "joinedDate", Types.TIMESTAMP },
			{ "employmentContractStartDate", Types.TIMESTAMP },
			{ "employmentContractEndDate", Types.TIMESTAMP },
			{ "contractDetails", Types.BLOB },
			{ "employeeId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table hrm_Job (jobId LONG not null primary key,jobTitleId LONG,jobCategoryId LONG,subUnitId LONG,locationId LONG,employmentStatusId LONG,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,joinedDate DATE null,employmentContractStartDate DATE null,employmentContractEndDate DATE null,contractDetails BLOB,employeeId LONG)";
	public static final String TABLE_SQL_DROP = "drop table hrm_Job";
	public static final String ORDER_BY_JPQL = " ORDER BY job.jobId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY hrm_Job.jobId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.Job"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.Job"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.Job"),
			true);
	public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
	public static long JOBID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.Job"));

	public JobModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jobId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJobId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Job.class;
	}

	@Override
	public String getModelClassName() {
		return Job.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jobId", getJobId());
		attributes.put("jobTitleId", getJobTitleId());
		attributes.put("jobCategoryId", getJobCategoryId());
		attributes.put("subUnitId", getSubUnitId());
		attributes.put("locationId", getLocationId());
		attributes.put("employmentStatusId", getEmploymentStatusId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("joinedDate", getJoinedDate());
		attributes.put("employmentContractStartDate",
			getEmploymentContractStartDate());
		attributes.put("employmentContractEndDate",
			getEmploymentContractEndDate());
		attributes.put("contractDetails", getContractDetails());
		attributes.put("employeeId", getEmployeeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
		}

		Long jobTitleId = (Long)attributes.get("jobTitleId");

		if (jobTitleId != null) {
			setJobTitleId(jobTitleId);
		}

		Long jobCategoryId = (Long)attributes.get("jobCategoryId");

		if (jobCategoryId != null) {
			setJobCategoryId(jobCategoryId);
		}

		Long subUnitId = (Long)attributes.get("subUnitId");

		if (subUnitId != null) {
			setSubUnitId(subUnitId);
		}

		Long locationId = (Long)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		Long employmentStatusId = (Long)attributes.get("employmentStatusId");

		if (employmentStatusId != null) {
			setEmploymentStatusId(employmentStatusId);
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

		Date joinedDate = (Date)attributes.get("joinedDate");

		if (joinedDate != null) {
			setJoinedDate(joinedDate);
		}

		Date employmentContractStartDate = (Date)attributes.get(
				"employmentContractStartDate");

		if (employmentContractStartDate != null) {
			setEmploymentContractStartDate(employmentContractStartDate);
		}

		Date employmentContractEndDate = (Date)attributes.get(
				"employmentContractEndDate");

		if (employmentContractEndDate != null) {
			setEmploymentContractEndDate(employmentContractEndDate);
		}

		Blob contractDetails = (Blob)attributes.get("contractDetails");

		if (contractDetails != null) {
			setContractDetails(contractDetails);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}
	}

	@Override
	public long getJobId() {
		return _jobId;
	}

	@Override
	public void setJobId(long jobId) {
		_jobId = jobId;
	}

	@Override
	public long getJobTitleId() {
		return _jobTitleId;
	}

	@Override
	public void setJobTitleId(long jobTitleId) {
		_jobTitleId = jobTitleId;
	}

	@Override
	public long getJobCategoryId() {
		return _jobCategoryId;
	}

	@Override
	public void setJobCategoryId(long jobCategoryId) {
		_jobCategoryId = jobCategoryId;
	}

	@Override
	public long getSubUnitId() {
		return _subUnitId;
	}

	@Override
	public void setSubUnitId(long subUnitId) {
		_subUnitId = subUnitId;
	}

	@Override
	public long getLocationId() {
		return _locationId;
	}

	@Override
	public void setLocationId(long locationId) {
		_locationId = locationId;
	}

	@Override
	public long getEmploymentStatusId() {
		return _employmentStatusId;
	}

	@Override
	public void setEmploymentStatusId(long employmentStatusId) {
		_employmentStatusId = employmentStatusId;
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
	public Date getJoinedDate() {
		return _joinedDate;
	}

	@Override
	public void setJoinedDate(Date joinedDate) {
		_joinedDate = joinedDate;
	}

	@Override
	public Date getEmploymentContractStartDate() {
		return _employmentContractStartDate;
	}

	@Override
	public void setEmploymentContractStartDate(Date employmentContractStartDate) {
		_employmentContractStartDate = employmentContractStartDate;
	}

	@Override
	public Date getEmploymentContractEndDate() {
		return _employmentContractEndDate;
	}

	@Override
	public void setEmploymentContractEndDate(Date employmentContractEndDate) {
		_employmentContractEndDate = employmentContractEndDate;
	}

	@Override
	public Blob getContractDetails() {
		if (_contractDetailsBlobModel == null) {
			try {
				_contractDetailsBlobModel = JobLocalServiceUtil.getContractDetailsBlobModel(getPrimaryKey());
			}
			catch (Exception e) {
			}
		}

		Blob blob = null;

		if (_contractDetailsBlobModel != null) {
			blob = _contractDetailsBlobModel.getContractDetailsBlob();
		}

		return blob;
	}

	@Override
	public void setContractDetails(Blob contractDetails) {
		if (_contractDetailsBlobModel == null) {
			_contractDetailsBlobModel = new JobContractDetailsBlobModel(getPrimaryKey(),
					contractDetails);
		}
		else {
			_contractDetailsBlobModel.setContractDetailsBlob(contractDetails);
		}
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Job.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Job toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Job)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		JobImpl jobImpl = new JobImpl();

		jobImpl.setJobId(getJobId());
		jobImpl.setJobTitleId(getJobTitleId());
		jobImpl.setJobCategoryId(getJobCategoryId());
		jobImpl.setSubUnitId(getSubUnitId());
		jobImpl.setLocationId(getLocationId());
		jobImpl.setEmploymentStatusId(getEmploymentStatusId());
		jobImpl.setGroupId(getGroupId());
		jobImpl.setCompanyId(getCompanyId());
		jobImpl.setUserId(getUserId());
		jobImpl.setCreateDate(getCreateDate());
		jobImpl.setModifiedDate(getModifiedDate());
		jobImpl.setJoinedDate(getJoinedDate());
		jobImpl.setEmploymentContractStartDate(getEmploymentContractStartDate());
		jobImpl.setEmploymentContractEndDate(getEmploymentContractEndDate());
		jobImpl.setEmployeeId(getEmployeeId());

		jobImpl.resetOriginalValues();

		return jobImpl;
	}

	@Override
	public int compareTo(Job job) {
		long primaryKey = job.getPrimaryKey();

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

		if (!(obj instanceof Job)) {
			return false;
		}

		Job job = (Job)obj;

		long primaryKey = job.getPrimaryKey();

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
		JobModelImpl jobModelImpl = this;

		jobModelImpl._contractDetailsBlobModel = null;

		jobModelImpl._originalEmployeeId = jobModelImpl._employeeId;

		jobModelImpl._setOriginalEmployeeId = false;

		jobModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Job> toCacheModel() {
		JobCacheModel jobCacheModel = new JobCacheModel();

		jobCacheModel.jobId = getJobId();

		jobCacheModel.jobTitleId = getJobTitleId();

		jobCacheModel.jobCategoryId = getJobCategoryId();

		jobCacheModel.subUnitId = getSubUnitId();

		jobCacheModel.locationId = getLocationId();

		jobCacheModel.employmentStatusId = getEmploymentStatusId();

		jobCacheModel.groupId = getGroupId();

		jobCacheModel.companyId = getCompanyId();

		jobCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			jobCacheModel.createDate = createDate.getTime();
		}
		else {
			jobCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			jobCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			jobCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date joinedDate = getJoinedDate();

		if (joinedDate != null) {
			jobCacheModel.joinedDate = joinedDate.getTime();
		}
		else {
			jobCacheModel.joinedDate = Long.MIN_VALUE;
		}

		Date employmentContractStartDate = getEmploymentContractStartDate();

		if (employmentContractStartDate != null) {
			jobCacheModel.employmentContractStartDate = employmentContractStartDate.getTime();
		}
		else {
			jobCacheModel.employmentContractStartDate = Long.MIN_VALUE;
		}

		Date employmentContractEndDate = getEmploymentContractEndDate();

		if (employmentContractEndDate != null) {
			jobCacheModel.employmentContractEndDate = employmentContractEndDate.getTime();
		}
		else {
			jobCacheModel.employmentContractEndDate = Long.MIN_VALUE;
		}

		jobCacheModel.employeeId = getEmployeeId();

		return jobCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{jobId=");
		sb.append(getJobId());
		sb.append(", jobTitleId=");
		sb.append(getJobTitleId());
		sb.append(", jobCategoryId=");
		sb.append(getJobCategoryId());
		sb.append(", subUnitId=");
		sb.append(getSubUnitId());
		sb.append(", locationId=");
		sb.append(getLocationId());
		sb.append(", employmentStatusId=");
		sb.append(getEmploymentStatusId());
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
		sb.append(", joinedDate=");
		sb.append(getJoinedDate());
		sb.append(", employmentContractStartDate=");
		sb.append(getEmploymentContractStartDate());
		sb.append(", employmentContractEndDate=");
		sb.append(getEmploymentContractEndDate());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.Job");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>jobId</column-name><column-value><![CDATA[");
		sb.append(getJobId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitleId</column-name><column-value><![CDATA[");
		sb.append(getJobTitleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobCategoryId</column-name><column-value><![CDATA[");
		sb.append(getJobCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subUnitId</column-name><column-value><![CDATA[");
		sb.append(getSubUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employmentStatusId</column-name><column-value><![CDATA[");
		sb.append(getEmploymentStatusId());
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
			"<column><column-name>joinedDate</column-name><column-value><![CDATA[");
		sb.append(getJoinedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employmentContractStartDate</column-name><column-value><![CDATA[");
		sb.append(getEmploymentContractStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employmentContractEndDate</column-name><column-value><![CDATA[");
		sb.append(getEmploymentContractEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Job.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Job.class };
	private long _jobId;
	private long _jobTitleId;
	private long _jobCategoryId;
	private long _subUnitId;
	private long _locationId;
	private long _employmentStatusId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _joinedDate;
	private Date _employmentContractStartDate;
	private Date _employmentContractEndDate;
	private JobContractDetailsBlobModel _contractDetailsBlobModel;
	private long _employeeId;
	private long _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private long _columnBitmask;
	private Job _escapedModel;
}
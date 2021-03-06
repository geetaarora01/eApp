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

import com.liferay.portal.kernel.exception.SystemException;

import com.rknowsys.eapp.hrm.model.WorkExpCompany;
import com.rknowsys.eapp.hrm.service.WorkExpCompanyLocalServiceUtil;

/**
 * The extended model base implementation for the WorkExpCompany service. Represents a row in the &quot;work_exp_company&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkExpCompanyImpl}.
 * </p>
 *
 * @author rknowsys
 * @see WorkExpCompanyImpl
 * @see com.rknowsys.eapp.hrm.model.WorkExpCompany
 * @generated
 */
public abstract class WorkExpCompanyBaseImpl extends WorkExpCompanyModelImpl
	implements WorkExpCompany {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a WorkExpCompany model instance should use the {@link WorkExpCompany} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WorkExpCompanyLocalServiceUtil.addWorkExpCompany(this);
		}
		else {
			WorkExpCompanyLocalServiceUtil.updateWorkExpCompany(this);
		}
	}
}
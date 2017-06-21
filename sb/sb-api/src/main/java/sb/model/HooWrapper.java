/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package sb.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Hoo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Hoo
 * @generated
 */
@ProviderType
public class HooWrapper implements Hoo, ModelWrapper<Hoo> {
	public HooWrapper(Hoo hoo) {
		_hoo = hoo;
	}

	@Override
	public Class<?> getModelClass() {
		return Hoo.class;
	}

	@Override
	public String getModelClassName() {
		return Hoo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("hooId", getHooId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", getField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long hooId = (Long)attributes.get("hooId");

		if (hooId != null) {
			setHooId(hooId);
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

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	/**
	* Returns the field2 of this hoo.
	*
	* @return the field2 of this hoo
	*/
	@Override
	public boolean getField2() {
		return _hoo.getField2();
	}

	@Override
	public boolean isCachedModel() {
		return _hoo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _hoo.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this hoo is field2.
	*
	* @return <code>true</code> if this hoo is field2; <code>false</code> otherwise
	*/
	@Override
	public boolean isField2() {
		return _hoo.isField2();
	}

	@Override
	public boolean isNew() {
		return _hoo.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _hoo.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<sb.model.Hoo> toCacheModel() {
		return _hoo.toCacheModel();
	}

	@Override
	public int compareTo(sb.model.Hoo hoo) {
		return _hoo.compareTo(hoo);
	}

	/**
	* Returns the field3 of this hoo.
	*
	* @return the field3 of this hoo
	*/
	@Override
	public int getField3() {
		return _hoo.getField3();
	}

	@Override
	public int hashCode() {
		return _hoo.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _hoo.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new HooWrapper((Hoo)_hoo.clone());
	}

	/**
	* Returns the field1 of this hoo.
	*
	* @return the field1 of this hoo
	*/
	@Override
	public java.lang.String getField1() {
		return _hoo.getField1();
	}

	/**
	* Returns the field5 of this hoo.
	*
	* @return the field5 of this hoo
	*/
	@Override
	public java.lang.String getField5() {
		return _hoo.getField5();
	}

	/**
	* Returns the user name of this hoo.
	*
	* @return the user name of this hoo
	*/
	@Override
	public java.lang.String getUserName() {
		return _hoo.getUserName();
	}

	/**
	* Returns the user uuid of this hoo.
	*
	* @return the user uuid of this hoo
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _hoo.getUserUuid();
	}

	/**
	* Returns the uuid of this hoo.
	*
	* @return the uuid of this hoo
	*/
	@Override
	public java.lang.String getUuid() {
		return _hoo.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _hoo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _hoo.toXmlString();
	}

	/**
	* Returns the create date of this hoo.
	*
	* @return the create date of this hoo
	*/
	@Override
	public Date getCreateDate() {
		return _hoo.getCreateDate();
	}

	/**
	* Returns the field4 of this hoo.
	*
	* @return the field4 of this hoo
	*/
	@Override
	public Date getField4() {
		return _hoo.getField4();
	}

	/**
	* Returns the modified date of this hoo.
	*
	* @return the modified date of this hoo
	*/
	@Override
	public Date getModifiedDate() {
		return _hoo.getModifiedDate();
	}

	/**
	* Returns the company ID of this hoo.
	*
	* @return the company ID of this hoo
	*/
	@Override
	public long getCompanyId() {
		return _hoo.getCompanyId();
	}

	/**
	* Returns the group ID of this hoo.
	*
	* @return the group ID of this hoo
	*/
	@Override
	public long getGroupId() {
		return _hoo.getGroupId();
	}

	/**
	* Returns the hoo ID of this hoo.
	*
	* @return the hoo ID of this hoo
	*/
	@Override
	public long getHooId() {
		return _hoo.getHooId();
	}

	/**
	* Returns the primary key of this hoo.
	*
	* @return the primary key of this hoo
	*/
	@Override
	public long getPrimaryKey() {
		return _hoo.getPrimaryKey();
	}

	/**
	* Returns the user ID of this hoo.
	*
	* @return the user ID of this hoo
	*/
	@Override
	public long getUserId() {
		return _hoo.getUserId();
	}

	@Override
	public sb.model.Hoo toEscapedModel() {
		return new HooWrapper(_hoo.toEscapedModel());
	}

	@Override
	public sb.model.Hoo toUnescapedModel() {
		return new HooWrapper(_hoo.toUnescapedModel());
	}

	@Override
	public void persist() {
		_hoo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hoo.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this hoo.
	*
	* @param companyId the company ID of this hoo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_hoo.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this hoo.
	*
	* @param createDate the create date of this hoo
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_hoo.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_hoo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_hoo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_hoo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field1 of this hoo.
	*
	* @param field1 the field1 of this hoo
	*/
	@Override
	public void setField1(java.lang.String field1) {
		_hoo.setField1(field1);
	}

	/**
	* Sets whether this hoo is field2.
	*
	* @param field2 the field2 of this hoo
	*/
	@Override
	public void setField2(boolean field2) {
		_hoo.setField2(field2);
	}

	/**
	* Sets the field3 of this hoo.
	*
	* @param field3 the field3 of this hoo
	*/
	@Override
	public void setField3(int field3) {
		_hoo.setField3(field3);
	}

	/**
	* Sets the field4 of this hoo.
	*
	* @param field4 the field4 of this hoo
	*/
	@Override
	public void setField4(Date field4) {
		_hoo.setField4(field4);
	}

	/**
	* Sets the field5 of this hoo.
	*
	* @param field5 the field5 of this hoo
	*/
	@Override
	public void setField5(java.lang.String field5) {
		_hoo.setField5(field5);
	}

	/**
	* Sets the group ID of this hoo.
	*
	* @param groupId the group ID of this hoo
	*/
	@Override
	public void setGroupId(long groupId) {
		_hoo.setGroupId(groupId);
	}

	/**
	* Sets the hoo ID of this hoo.
	*
	* @param hooId the hoo ID of this hoo
	*/
	@Override
	public void setHooId(long hooId) {
		_hoo.setHooId(hooId);
	}

	/**
	* Sets the modified date of this hoo.
	*
	* @param modifiedDate the modified date of this hoo
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_hoo.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_hoo.setNew(n);
	}

	/**
	* Sets the primary key of this hoo.
	*
	* @param primaryKey the primary key of this hoo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_hoo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_hoo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this hoo.
	*
	* @param userId the user ID of this hoo
	*/
	@Override
	public void setUserId(long userId) {
		_hoo.setUserId(userId);
	}

	/**
	* Sets the user name of this hoo.
	*
	* @param userName the user name of this hoo
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_hoo.setUserName(userName);
	}

	/**
	* Sets the user uuid of this hoo.
	*
	* @param userUuid the user uuid of this hoo
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_hoo.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this hoo.
	*
	* @param uuid the uuid of this hoo
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_hoo.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HooWrapper)) {
			return false;
		}

		HooWrapper hooWrapper = (HooWrapper)obj;

		if (Objects.equals(_hoo, hooWrapper._hoo)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _hoo.getStagedModelType();
	}

	@Override
	public Hoo getWrappedModel() {
		return _hoo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _hoo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _hoo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_hoo.resetOriginalValues();
	}

	private final Hoo _hoo;
}
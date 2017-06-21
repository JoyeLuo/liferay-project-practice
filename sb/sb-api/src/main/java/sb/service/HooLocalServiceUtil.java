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

package sb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Hoo. This utility wraps
 * {@link sb.service.impl.HooLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HooLocalService
 * @see sb.service.base.HooLocalServiceBaseImpl
 * @see sb.service.impl.HooLocalServiceImpl
 * @generated
 */
@ProviderType
public class HooLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link sb.service.impl.HooLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of hoos.
	*
	* @return the number of hoos
	*/
	public static int getHoosCount() {
		return getService().getHoosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sb.model.impl.HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sb.model.impl.HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the hoos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sb.model.impl.HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @return the range of hoos
	*/
	public static java.util.List<sb.model.Hoo> getHoos(int start, int end) {
		return getService().getHoos(start, end);
	}

	/**
	* Returns all the hoos matching the UUID and company.
	*
	* @param uuid the UUID of the hoos
	* @param companyId the primary key of the company
	* @return the matching hoos, or an empty list if no matches were found
	*/
	public static java.util.List<sb.model.Hoo> getHoosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getHoosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of hoos matching the UUID and company.
	*
	* @param uuid the UUID of the hoos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching hoos, or an empty list if no matches were found
	*/
	public static java.util.List<sb.model.Hoo> getHoosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sb.model.Hoo> orderByComparator) {
		return getService()
				   .getHoosByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the hoo to the database. Also notifies the appropriate model listeners.
	*
	* @param hoo the hoo
	* @return the hoo that was added
	*/
	public static sb.model.Hoo addHoo(sb.model.Hoo hoo) {
		return getService().addHoo(hoo);
	}

	/**
	* Creates a new hoo with the primary key. Does not add the hoo to the database.
	*
	* @param hooId the primary key for the new hoo
	* @return the new hoo
	*/
	public static sb.model.Hoo createHoo(long hooId) {
		return getService().createHoo(hooId);
	}

	/**
	* Deletes the hoo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hooId the primary key of the hoo
	* @return the hoo that was removed
	* @throws PortalException if a hoo with the primary key could not be found
	*/
	public static sb.model.Hoo deleteHoo(long hooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteHoo(hooId);
	}

	/**
	* Deletes the hoo from the database. Also notifies the appropriate model listeners.
	*
	* @param hoo the hoo
	* @return the hoo that was removed
	*/
	public static sb.model.Hoo deleteHoo(sb.model.Hoo hoo) {
		return getService().deleteHoo(hoo);
	}

	public static sb.model.Hoo fetchHoo(long hooId) {
		return getService().fetchHoo(hooId);
	}

	/**
	* Returns the hoo matching the UUID and group.
	*
	* @param uuid the hoo's UUID
	* @param groupId the primary key of the group
	* @return the matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public static sb.model.Hoo fetchHooByUuidAndGroupId(java.lang.String uuid,
		long groupId) {
		return getService().fetchHooByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the hoo with the primary key.
	*
	* @param hooId the primary key of the hoo
	* @return the hoo
	* @throws PortalException if a hoo with the primary key could not be found
	*/
	public static sb.model.Hoo getHoo(long hooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHoo(hooId);
	}

	/**
	* Returns the hoo matching the UUID and group.
	*
	* @param uuid the hoo's UUID
	* @param groupId the primary key of the group
	* @return the matching hoo
	* @throws PortalException if a matching hoo could not be found
	*/
	public static sb.model.Hoo getHooByUuidAndGroupId(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHooByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the hoo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hoo the hoo
	* @return the hoo that was updated
	*/
	public static sb.model.Hoo updateHoo(sb.model.Hoo hoo) {
		return getService().updateHoo(hoo);
	}

	public static HooLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HooLocalService, HooLocalService> _serviceTracker =
		ServiceTrackerFactory.open(HooLocalService.class);
}
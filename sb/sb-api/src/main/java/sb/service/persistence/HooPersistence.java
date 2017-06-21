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

package sb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import sb.exception.NoSuchHooException;

import sb.model.Hoo;

/**
 * The persistence interface for the hoo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sb.service.persistence.impl.HooPersistenceImpl
 * @see HooUtil
 * @generated
 */
@ProviderType
public interface HooPersistence extends BasePersistence<Hoo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HooUtil} to access the hoo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the hoos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching hoos
	*/
	public java.util.List<Hoo> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the hoos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @return the range of matching hoos
	*/
	public java.util.List<Hoo> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the hoos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hoos
	*/
	public java.util.List<Hoo> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns an ordered range of all the hoos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hoos
	*/
	public java.util.List<Hoo> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hoo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hoo
	* @throws NoSuchHooException if a matching hoo could not be found
	*/
	public Hoo findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Returns the first hoo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns the last hoo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hoo
	* @throws NoSuchHooException if a matching hoo could not be found
	*/
	public Hoo findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Returns the last hoo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns the hoos before and after the current hoo in the ordered set where uuid = &#63;.
	*
	* @param hooId the primary key of the current hoo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hoo
	* @throws NoSuchHooException if a hoo with the primary key could not be found
	*/
	public Hoo[] findByUuid_PrevAndNext(long hooId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Removes all the hoos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of hoos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching hoos
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the hoo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHooException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hoo
	* @throws NoSuchHooException if a matching hoo could not be found
	*/
	public Hoo findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHooException;

	/**
	* Returns the hoo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the hoo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the hoo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the hoo that was removed
	*/
	public Hoo removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHooException;

	/**
	* Returns the number of hoos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching hoos
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the hoos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching hoos
	*/
	public java.util.List<Hoo> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the hoos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @return the range of matching hoos
	*/
	public java.util.List<Hoo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the hoos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hoos
	*/
	public java.util.List<Hoo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns an ordered range of all the hoos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hoos
	*/
	public java.util.List<Hoo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hoo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hoo
	* @throws NoSuchHooException if a matching hoo could not be found
	*/
	public Hoo findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Returns the first hoo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns the last hoo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hoo
	* @throws NoSuchHooException if a matching hoo could not be found
	*/
	public Hoo findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Returns the last hoo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns the hoos before and after the current hoo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param hooId the primary key of the current hoo
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hoo
	* @throws NoSuchHooException if a hoo with the primary key could not be found
	*/
	public Hoo[] findByUuid_C_PrevAndNext(long hooId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Removes all the hoos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of hoos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching hoos
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the hoos where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching hoos
	*/
	public java.util.List<Hoo> findByField2(boolean field2);

	/**
	* Returns a range of all the hoos where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @return the range of matching hoos
	*/
	public java.util.List<Hoo> findByField2(boolean field2, int start, int end);

	/**
	* Returns an ordered range of all the hoos where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hoos
	*/
	public java.util.List<Hoo> findByField2(boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns an ordered range of all the hoos where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hoos
	*/
	public java.util.List<Hoo> findByField2(boolean field2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hoo in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hoo
	* @throws NoSuchHooException if a matching hoo could not be found
	*/
	public Hoo findByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Returns the first hoo in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns the last hoo in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hoo
	* @throws NoSuchHooException if a matching hoo could not be found
	*/
	public Hoo findByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Returns the last hoo in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hoo, or <code>null</code> if a matching hoo could not be found
	*/
	public Hoo fetchByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns the hoos before and after the current hoo in the ordered set where field2 = &#63;.
	*
	* @param hooId the primary key of the current hoo
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hoo
	* @throws NoSuchHooException if a hoo with the primary key could not be found
	*/
	public Hoo[] findByField2_PrevAndNext(long hooId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator)
		throws NoSuchHooException;

	/**
	* Removes all the hoos where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(boolean field2);

	/**
	* Returns the number of hoos where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching hoos
	*/
	public int countByField2(boolean field2);

	/**
	* Caches the hoo in the entity cache if it is enabled.
	*
	* @param hoo the hoo
	*/
	public void cacheResult(Hoo hoo);

	/**
	* Caches the hoos in the entity cache if it is enabled.
	*
	* @param hoos the hoos
	*/
	public void cacheResult(java.util.List<Hoo> hoos);

	/**
	* Creates a new hoo with the primary key. Does not add the hoo to the database.
	*
	* @param hooId the primary key for the new hoo
	* @return the new hoo
	*/
	public Hoo create(long hooId);

	/**
	* Removes the hoo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hooId the primary key of the hoo
	* @return the hoo that was removed
	* @throws NoSuchHooException if a hoo with the primary key could not be found
	*/
	public Hoo remove(long hooId) throws NoSuchHooException;

	public Hoo updateImpl(Hoo hoo);

	/**
	* Returns the hoo with the primary key or throws a {@link NoSuchHooException} if it could not be found.
	*
	* @param hooId the primary key of the hoo
	* @return the hoo
	* @throws NoSuchHooException if a hoo with the primary key could not be found
	*/
	public Hoo findByPrimaryKey(long hooId) throws NoSuchHooException;

	/**
	* Returns the hoo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hooId the primary key of the hoo
	* @return the hoo, or <code>null</code> if a hoo with the primary key could not be found
	*/
	public Hoo fetchByPrimaryKey(long hooId);

	@Override
	public java.util.Map<java.io.Serializable, Hoo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the hoos.
	*
	* @return the hoos
	*/
	public java.util.List<Hoo> findAll();

	/**
	* Returns a range of all the hoos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @return the range of hoos
	*/
	public java.util.List<Hoo> findAll(int start, int end);

	/**
	* Returns an ordered range of all the hoos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hoos
	*/
	public java.util.List<Hoo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator);

	/**
	* Returns an ordered range of all the hoos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hoos
	* @param end the upper bound of the range of hoos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of hoos
	*/
	public java.util.List<Hoo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hoo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the hoos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of hoos.
	*
	* @return the number of hoos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}
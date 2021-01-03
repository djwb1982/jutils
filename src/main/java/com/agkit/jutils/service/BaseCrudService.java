package com.agkit.jutils.service;


import com.agkit.jutils.entity.PageEntity;

import java.util.List;

/**
 * @program: com.agcloud.common.service.BaseCrudService
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-11-20 09:51
 **/
public interface BaseCrudService<T> {
	/**
	 * 查询单条数据
	 * @return
	 */
	T select(T t) throws Throwable;

	/**
	 * 查询满足条件的数据条数
	 * @return
	 */
	Integer selectCount(T t) throws Throwable;

	/**
	 * 查询数据列表
	 * @param t
	 * @return
	 */
	List<T> selectList(T t) throws Throwable;

	/**
	 * 分页查询
	 * @param page
	 * @param t
	 * @return
	 */
	List<T> selectPage(T t, PageEntity pageEntity)throws Throwable;

	/**
	 * 保存单条数据（新数据插入）
	 * @param t
	 */
	void insert(T t) throws Throwable;

	/**
	 * 保存单条数据（新数据插入）
	 * @param t
	 */
	void insertList(List<T> tList) throws Throwable;

	/**
	 * 保存单条数据（新数据插入或已有数据更新）
	 * @param t
	 * @throws Throwable
	 */
	void merge(T t) throws Throwable;

	/**
	 * 保存多条数据（新数据插入或已有数据更新）
	 * @param t
	 * @throws Throwable
	 */
	void mergeList(List<T> tList) throws Throwable;

	/**
	 * 修改单条数据
	 * @param t
	 * @throws Throwable
	 */
	void update(T t) throws Throwable;

	/**
	 * 修改多条数据
	 * @param t
	 * @throws Throwable
	 */
	void updateList(List<T> tList) throws Throwable;

	/**
	 * 删除单条数据
	 * @param t
	 */
	void delete(T t) throws Throwable;

	/**
	 * 删除多条数据
	 * @param t
	 */
	void deleteList(List<T> tList) throws Throwable;
}


package com.agkit.jutils.dao;

import java.util.List;

/**
 * @program: com.agcloud.common.dao.BaseCrudDao
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-11-19 23:00
 **/
public interface BaseCrudDao<T> extends BaseDao {
    	/**
	 * 获取单条数据
	 *
	 * @param entity
	 * @return
	 */
	public T select(T t) throws Throwable;

	/**
	 *
	 * @param entity
	 * @return
	 */
	public List<T> selectList(T t) throws Throwable;

	/**
	 * 查询满足条件的记录条数
	 * @param t
	 * @return
	 * @throws Throwable
	 */
	public int selectCount(T t) throws Throwable;

	/**
	 *
	 * 分页查询
	 * @param t
	 * @return
	 * @throws Throwable
	 */
	public List<T> selectPage(T t) throws Throwable;

	/**
	 * 插入数据
	 *
	 * @param entity
	 * @return
	 */
	public int insert(T t) throws Throwable;

	/**
	 * 插入数据
	 *
	 * @param entity
	 * @return
	 */
	public int insertList(List<T> tList) throws Throwable;

	/**
	 * 更新数据
	 *
	 * @param entity
	 * @return
	 */
	public int update(T t) throws Throwable;

	/**
	 * 批量更新数据
	 * @param tList
	 * @throws Throwable
	 */
	public void updateList(List<T> tList) throws Throwable;

	/**
	 * 根据id批量合并数据
	 * @param tList
	 * @throws Throwable
	 */
	public void mergeList(List<T> tList) throws Throwable;

	/**
	 * 删除数据（一般为逻辑删除，更新del_flag字段为1）
	 *
	 * @param entity
	 * @return
	 */
	public int delete(T t) throws Throwable;

	/**
	 * 批量删除数据
	 * @param tList
	 * @throws Throwable
	 */
	public void deleteList(List<T> tList) throws Throwable;
}

package com.agkit.jutils.service;

import com.agkit.jutils.dao.BaseCrudDao;
import com.agkit.jutils.entity.BaseCrudEntity;
import com.agkit.jutils.entity.PageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: com.agcloud.common.service.BaseCrudServiceImpl
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-11-20 09:52
 **/
public class BaseCrudServiceImpl<D extends BaseCrudDao<T>, T extends BaseCrudEntity<T>> implements BaseCrudService<T> {
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;

	@Override
	public T select(T t) throws Throwable
	{
		return dao.select(t);
	}

	@Override
	public Integer selectCount(T t) throws Throwable
	{
		return dao.selectCount(t);
	}

	@Override
	public List<T> selectList(T t) throws Throwable
	{
		return dao.selectList(t);
	}

	/**
	 *
	 *
	 * @param t
	 * @param pageEntity
	 * @throws Exception
	 */
	protected void checkPage(T t, PageEntity pageEntity) throws Exception
	{
		if(null == pageEntity)
		{
			throw new Exception("分页参数不能为空");
		}

		if(pageEntity.getPageSize() <= 0)
		{
			throw new Exception("每页结果数不能小于等于0");
		}

		int currentPage = pageEntity.getCurrentPage();
		if(currentPage <= 0)
		{
			throw new Exception("当前页号不能小于等于0");
		}

		t.setOffsetPara((pageEntity.getCurrentPage() - 1) * pageEntity.getPageSize());
		t.setLimitPara(pageEntity.getPageSize());
	}

	@Override
	public List<T> selectPage(T t, PageEntity pageEntity) throws Throwable
	{
		checkPage(t, pageEntity);
		final Integer totalResultSize = dao.selectCount(t);
		if(false == checkSize(pageEntity, totalResultSize))
		{
			return null;
		}
		return dao.selectPage(t);
	}

	/**
	 *
	 * @param t
	 * @param pageEntity
	 */
	protected boolean checkSize(PageEntity pageEntity, Integer totalResultSize)
	{
		if (totalResultSize == null || totalResultSize == 0) {
			pageEntity.setTotalResultSize(0);
			final int totalPageSize = 0;
			pageEntity.setTotalPageSize(totalPageSize);
			return false;
		}
		pageEntity.setTotalResultSize((int) totalResultSize);
		final int totalPageSize = (pageEntity.getTotalResultSize() - 1) / pageEntity.getPageSize() + 1;
		pageEntity.setTotalPageSize(totalPageSize);
		int currentPage = pageEntity.getCurrentPage();
		if(currentPage > totalPageSize)
		{
			return false;
		}
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public void insert(T t) throws Throwable
	{
		t.preInsert();
		dao.insert(t);
	}

	@Override
	@Transactional(readOnly = false)
	public void insertList(List<T> tList) throws Throwable
	{
		dao.insertList(tList);
	}

	@Override
	@Transactional(readOnly = false)
	public void merge(T t) throws Throwable
	{
		if (null == t.getId())
		{
			t.preInsert();
			dao.insert(t);
		} else
		{
			t.preUpdate();
			dao.update(t);
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void mergeList(List<T> tList) throws Throwable
	{
		dao.mergeList(tList);
	}

	@Override
	@Transactional(readOnly = false)
	public void update(T t) throws Throwable
	{
		t.preUpdate();
		dao.update(t);
	}

	@Override
	@Transactional(readOnly = false)
	public void updateList(List<T> tList) throws Throwable
	{
		dao.updateList(tList);
	}

	@Override
	public void delete(T t) throws Throwable
	{
		dao.delete(t);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteList(List<T> tList) throws Throwable
	{
		dao.deleteList(tList);
	}

}

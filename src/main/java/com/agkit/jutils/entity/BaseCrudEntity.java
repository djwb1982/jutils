package com.agkit.jutils.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @program: com.agcloud.common.entity.BaseCrudEntity
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-11-19 22:54
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public abstract class BaseCrudEntity<T> extends BaseEntity implements Serializable {
	private Long id;

	protected int offsetPara = 0;
	protected int limitPara = 10;
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 插入之前执行方法，子类实现
	 */
	public void preInsert()throws Throwable
	{

	}

	/**
	 * 更新之前执行方法，子类实现
	 */
	public void preUpdate()throws Throwable
	{

	}

	/**
	 * 合并之前执行方法，子类实现
	 * @throws Throwable
	 */
	public void preMerge()throws Throwable
	{

	}
}

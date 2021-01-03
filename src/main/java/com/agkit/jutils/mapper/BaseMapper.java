package com.agkit.jutils.mapper;


import com.agkit.jutils.entity.Page;
import com.agkit.jutils.entity.PageModel;

import java.util.List;

/**
 * @program: com.agcloud.common.mapper.BaseMapper
 * @description:
 * @author: king djwb1982@163.com
 * @create: 2018-11-20 10:45
 **/
public interface BaseMapper<T> {

    /**获取所有数据(不分页)**/
	List<T> selectAll(T record);

	/**根据主键逻辑删除**/
    int deleteByPrimaryKey(String id);

    /**新增数据**/
    int insert(T record);

    /**新增数据**/
    int insertSelective(T record);

    /**根据主键获取数据**/
    T selectByPrimaryKey(String id);

    /**根据条件更新数据**/
    int updateByPrimaryKey(T record);

    /**根据条件更新数据**/

    int updateByPrimaryKeySelective(T record);

    /**获取所有数据(分页)**/
    Page queryPage(PageModel page);
}

package com.hihsoft.framework.core.baseclass.persistence;

import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 * Title: 数据库持久化基类 Description: Copyright: Copyright (c) 2014
 * Company:hihsoft.co.,ltd
 * 
 * @author hihsoft.co.,ltd
 * @version 1.0
 */

public interface BaseSqlMapper<T> {

	/**
	 * 新增
	 * 
	 * @param t
	 */
	
	public void insert(T t)throws DataAccessException;

	/**
	 * 批量插入数据
	 * 
	 * @param list
	 * @return
	 */
	
	public int insertBatch(List<T> list)throws DataAccessException;

	/**
	 * 修改
	 * 
	 * @param t
	 *
	 */
	public void update(T t)throws DataAccessException;

	/**
	 * 有选择性的更新
	 * 
	 * @param t
	 */
	public void updateBySelective(T t)throws DataAccessException;

	/**
	 * 删除
	 * 
	 * @param id
	 */
	public void delete(String id)throws DataAccessException;

	/**
	 * 查询明细
	 * 
	 * @param id
	 * @return
	 */
	public T selectDetailById(String id)throws DataAccessException;

}

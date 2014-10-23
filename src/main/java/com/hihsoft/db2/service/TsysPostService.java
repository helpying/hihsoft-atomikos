package com.hihsoft.db2.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hihsoft.framework.core.baseclass.service.BaseService;
import com.hihsoft.framework.exception.ServiceException;
import com.hihsoft.db2.persistence.TsysPostMapper;
/**
 * <p> Title: </p>
 * <p> Description:</p>
 * <p> Copyright: Copyright (c) 2014 </p>
 * <p> Company:hihsoft.co.,ltd </p>
 *
 * @author zhujw
 * @version 1.0
 */

@Service(value ="tsysPostService")
public class TsysPostService<T> extends BaseService<T> {
	@Autowired
	private TsysPostMapper<T> mapper;
	//@Autowired允许业务逻辑层调用其他服务
	//private TsysUserService<TsysUser> tsysUserService;

	public TsysPostMapper<T> getMapper() {
		return mapper;
	}
	
	public List selectPageTsysPostByMap(Map map) throws ServiceException {
		return getMapper().selectPageTsysPostByMap(map);

	}

	public List selectPageTsysPost() throws ServiceException {
		return getMapper().selectPageTsysPost();
	}

}

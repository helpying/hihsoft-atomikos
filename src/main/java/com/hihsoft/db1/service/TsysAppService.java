package com.hihsoft.db1.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hihsoft.db1.persistence.TsysAppMapper;
import com.hihsoft.framework.core.baseclass.service.BaseService;
import com.hihsoft.framework.exception.ServiceException;
/**
 * <p> Title: </p>
 * <p> Description:</p>
 * <p> Copyright: Copyright (c) 2014 </p>
 * <p> Company:hihsoft.co.,ltd </p>
 *
 * @author zhujw
 * @version 1.0
 */

@Service(value ="tsysAppService")
public class TsysAppService<T> extends BaseService<T> {
	@Autowired
	private TsysAppMapper<T> mapper;

	public TsysAppMapper<T> getMapper() {
		return mapper;
	}
	
	public List selectTsysApp() throws ServiceException {
		return getMapper().selectTsysApp();

	}

	
}

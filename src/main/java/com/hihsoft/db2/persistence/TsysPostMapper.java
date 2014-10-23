/**
 * <p> Title: </p>
 * <p> Description:</p>
 * <p> Copyright: Copyright (c) 2014 </p>
 * <p> Company:hihsoft.co.,ltd </p>
 *
 * @author zhujw
 * @version 1.0
 */

package com.hihsoft.db2.persistence;
import java.util.List;
import java.util.Map;

import com.hihsoft.framework.core.baseclass.persistence.BaseSqlMapper;

public interface TsysPostMapper<T> extends BaseSqlMapper<T> {
       
	public List<T> selectPageTsysPostByMap(Map<String, Object> para);

	public List<T> selectPageTsysPost();
}
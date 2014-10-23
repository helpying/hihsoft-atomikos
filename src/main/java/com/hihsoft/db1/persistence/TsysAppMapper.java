/**
 * <p> Title: </p>
 * <p> Description:</p>
 * <p> Copyright: Copyright (c) 2014 </p>
 * <p> Company:hihsoft.co.,ltd </p>
 *
 * @author zhujw
 * @version 1.0
 */

package com.hihsoft.db1.persistence;
import java.util.List;

import com.hihsoft.framework.core.baseclass.persistence.BaseSqlMapper;

public interface TsysAppMapper<T> extends BaseSqlMapper<T> {
       
	public List selectTsysApp();

	
}
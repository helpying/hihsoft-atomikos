package com.hihsoft.framework.core.utils;

import org.apache.commons.beanutils.Converter;

/**
 * 注册Converter, 用于apache commons BeanUtils.copyProperties()方法中的class类型转换;
 * 可以修改此处代码以添加新的Converter
 * 
 */
public final class StringConverter implements Converter {

public StringConverter() {
}

public Object convert(Class type, Object value) {
if (value == null || "".equals(value.toString())) {
return (String) null;
} else {
return value.toString();
}
}
}
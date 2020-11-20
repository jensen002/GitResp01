package com.demo.common.mapper;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author jensen
 * @date 2016/9/19
 */
@RegisterMapper
public interface BaseMapper<T, PK> extends Mapper<T>, IdListMapper<T, PK>, InsertListMapper<T> {
}

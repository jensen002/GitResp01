package com.demo.service.service;

import com.demo.item.pojo.SpecGroup;
import com.demo.item.pojo.SpecParam;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/18
 */
public interface SpecService {

    List<SpecGroup> querySpecGroupByCid(Long cid);

    void saveSpecGroup(SpecGroup specGroup);

    void deleteSpecGroup(Long id);

    void updateSpecGroup(SpecGroup specGroup);

    List<SpecParam> querySpecParams(Long gid, Long cid, Boolean searching, Boolean generic);

    void saveSpecParam(SpecParam specParam);

    void updateSpecParam(SpecParam specParam);

    void deleteSpecParam(Long id);

    List<SpecGroup> querySpecsByCid(Long cid);
}

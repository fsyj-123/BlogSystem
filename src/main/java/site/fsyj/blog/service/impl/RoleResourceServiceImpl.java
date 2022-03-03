package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.mapper.RoleResourceMapper;
import site.fsyj.blog.bean.RoleResource;
import site.fsyj.blog.service.RoleResourceService;
@Service
public class RoleResourceServiceImpl implements RoleResourceService{

    @Resource
    private RoleResourceMapper roleResourceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleResourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleResource record) {
        return roleResourceMapper.insert(record);
    }

    @Override
    public int insertSelective(RoleResource record) {
        return roleResourceMapper.insertSelective(record);
    }

    @Override
    public RoleResource selectByPrimaryKey(Integer id) {
        return roleResourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleResource record) {
        return roleResourceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleResource record) {
        return roleResourceMapper.updateByPrimaryKey(record);
    }

}

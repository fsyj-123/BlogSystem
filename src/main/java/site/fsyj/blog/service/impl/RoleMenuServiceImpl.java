package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.mapper.RoleMenuMapper;
import site.fsyj.blog.bean.RoleMenu;
import site.fsyj.blog.service.RoleMenuService;
@Service
public class RoleMenuServiceImpl implements RoleMenuService{

    @Resource
    private RoleMenuMapper roleMenuMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleMenu record) {
        return roleMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(RoleMenu record) {
        return roleMenuMapper.insertSelective(record);
    }

    @Override
    public RoleMenu selectByPrimaryKey(Integer id) {
        return roleMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleMenu record) {
        return roleMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleMenu record) {
        return roleMenuMapper.updateByPrimaryKey(record);
    }

}

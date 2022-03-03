package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.bean.UserAuth;
import site.fsyj.blog.mapper.UserAuthMapper;
import site.fsyj.blog.service.UserAuthService;
@Service
public class UserAuthServiceImpl implements UserAuthService{

    @Resource
    private UserAuthMapper userAuthMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userAuthMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserAuth record) {
        return userAuthMapper.insert(record);
    }

    @Override
    public int insertSelective(UserAuth record) {
        return userAuthMapper.insertSelective(record);
    }

    @Override
    public UserAuth selectByPrimaryKey(Integer id) {
        return userAuthMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAuth record) {
        return userAuthMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserAuth record) {
        return userAuthMapper.updateByPrimaryKey(record);
    }

}

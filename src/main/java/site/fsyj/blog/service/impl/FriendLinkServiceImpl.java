package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.bean.FriendLink;
import site.fsyj.blog.mapper.FriendLinkMapper;
import site.fsyj.blog.service.FriendLinkService;
@Service
public class FriendLinkServiceImpl implements FriendLinkService{

    @Resource
    private FriendLinkMapper friendLinkMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return friendLinkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FriendLink record) {
        return friendLinkMapper.insert(record);
    }

    @Override
    public int insertSelective(FriendLink record) {
        return friendLinkMapper.insertSelective(record);
    }

    @Override
    public FriendLink selectByPrimaryKey(Integer id) {
        return friendLinkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FriendLink record) {
        return friendLinkMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FriendLink record) {
        return friendLinkMapper.updateByPrimaryKey(record);
    }

}

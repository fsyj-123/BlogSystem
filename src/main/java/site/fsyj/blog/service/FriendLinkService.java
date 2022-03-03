package site.fsyj.blog.service;

import site.fsyj.blog.bean.FriendLink;
public interface FriendLinkService{


    int deleteByPrimaryKey(Integer id);

    int insert(FriendLink record);

    int insertSelective(FriendLink record);

    FriendLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FriendLink record);

    int updateByPrimaryKey(FriendLink record);

}

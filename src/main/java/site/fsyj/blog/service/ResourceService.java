package site.fsyj.blog.service;

import site.fsyj.blog.bean.Resource;
public interface ResourceService{


    int deleteByPrimaryKey(Integer id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

}

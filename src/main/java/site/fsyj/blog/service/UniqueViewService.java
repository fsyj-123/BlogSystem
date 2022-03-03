package site.fsyj.blog.service;

import site.fsyj.blog.bean.UniqueView;
public interface UniqueViewService{


    int deleteByPrimaryKey(Integer id);

    int insert(UniqueView record);

    int insertSelective(UniqueView record);

    UniqueView selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UniqueView record);

    int updateByPrimaryKey(UniqueView record);

}

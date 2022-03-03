package site.fsyj.blog.service;

import site.fsyj.blog.bean.Article;
public interface ArticleService{


    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

}

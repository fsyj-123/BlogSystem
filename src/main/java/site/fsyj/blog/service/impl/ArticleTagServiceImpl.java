package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.mapper.ArticleTagMapper;
import site.fsyj.blog.bean.ArticleTag;
import site.fsyj.blog.service.ArticleTagService;
@Service
public class ArticleTagServiceImpl implements ArticleTagService{

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return articleTagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ArticleTag record) {
        return articleTagMapper.insert(record);
    }

    @Override
    public int insertSelective(ArticleTag record) {
        return articleTagMapper.insertSelective(record);
    }

    @Override
    public ArticleTag selectByPrimaryKey(Integer id) {
        return articleTagMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ArticleTag record) {
        return articleTagMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ArticleTag record) {
        return articleTagMapper.updateByPrimaryKey(record);
    }

}

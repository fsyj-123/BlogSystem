package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.bean.Resource;
import site.fsyj.blog.mapper.ResourceMapper;
import site.fsyj.blog.service.ResourceService;
@Service
public class ResourceServiceImpl implements ResourceService{

    @Resource
    private ResourceMapper resourceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return resourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Resource record) {
        return resourceMapper.insert(record);
    }

    @Override
    public int insertSelective(Resource record) {
        return resourceMapper.insertSelective(record);
    }

    @Override
    public Resource selectByPrimaryKey(Integer id) {
        return resourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Resource record) {
        return resourceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Resource record) {
        return resourceMapper.updateByPrimaryKey(record);
    }

}

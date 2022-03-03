package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.bean.UniqueView;
import site.fsyj.blog.mapper.UniqueViewMapper;
import site.fsyj.blog.service.UniqueViewService;
@Service
public class UniqueViewServiceImpl implements UniqueViewService{

    @Resource
    private UniqueViewMapper uniqueViewMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return uniqueViewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UniqueView record) {
        return uniqueViewMapper.insert(record);
    }

    @Override
    public int insertSelective(UniqueView record) {
        return uniqueViewMapper.insertSelective(record);
    }

    @Override
    public UniqueView selectByPrimaryKey(Integer id) {
        return uniqueViewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UniqueView record) {
        return uniqueViewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UniqueView record) {
        return uniqueViewMapper.updateByPrimaryKey(record);
    }

}

package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.mapper.MessageMapper;
import site.fsyj.blog.bean.Message;
import site.fsyj.blog.service.MessageService;
@Service
public class MessageServiceImpl implements MessageService{

    @Resource
    private MessageMapper messageMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public Message selectByPrimaryKey(Integer id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }

}

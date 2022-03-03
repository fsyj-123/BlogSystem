package site.fsyj.blog.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import site.fsyj.blog.mapper.ChatRecordMapper;
import site.fsyj.blog.bean.ChatRecord;
import site.fsyj.blog.service.ChatRecordService;
@Service
public class ChatRecordServiceImpl implements ChatRecordService{

    @Resource
    private ChatRecordMapper chatRecordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return chatRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ChatRecord record) {
        return chatRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(ChatRecord record) {
        return chatRecordMapper.insertSelective(record);
    }

    @Override
    public ChatRecord selectByPrimaryKey(Integer id) {
        return chatRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ChatRecord record) {
        return chatRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ChatRecord record) {
        return chatRecordMapper.updateByPrimaryKey(record);
    }

}

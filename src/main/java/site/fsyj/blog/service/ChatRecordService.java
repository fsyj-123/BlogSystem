package site.fsyj.blog.service;

import site.fsyj.blog.bean.ChatRecord;
public interface ChatRecordService{


    int deleteByPrimaryKey(Integer id);

    int insert(ChatRecord record);

    int insertSelective(ChatRecord record);

    ChatRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatRecord record);

    int updateByPrimaryKey(ChatRecord record);

}

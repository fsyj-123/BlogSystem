package site.fsyj.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import site.fsyj.blog.bean.ChatRecord;

@Mapper
public interface ChatRecordMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(ChatRecord record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(ChatRecord record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    ChatRecord selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(ChatRecord record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(ChatRecord record);
}
package site.fsyj.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import site.fsyj.blog.bean.UserInfo;

@Mapper
public interface UserInfoMapper {
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
    int insert(UserInfo record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserInfo record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserInfo record);
}
package indi.bootis.vtodo.account.mapper;

import indi.bootis.vtodo.account.model.Account;
import indi.bootis.vtodo.account.model.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    long countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    @Delete({
        "delete from account",
        "where id_ = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    @Insert({
        "insert into account (id_, name_, ",
        "email_, phone_number_, ",
        "active_, member_since_, ",
        "password_hash_, photo_url_)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{phoneNumber,jdbcType=VARCHAR}, ",
        "#{active,jdbcType=BIT}, #{memberSince,jdbcType=TIMESTAMP}, ",
        "#{passwordHash,jdbcType=VARCHAR}, #{photoUrl,jdbcType=VARCHAR})"
    })
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    List<Account> selectByExampleWithRowbounds(AccountExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    @Select({
        "select",
        "id_, name_, email_, phone_number_, active_, member_since_, password_hash_, photo_url_",
        "from account",
        "where id_ = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("indi.bootis.vtodo.account.mapper.AccountMapper.BaseResultMap")
    Account selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Sun Aug 11 20:52:52 CST 2019
     */
    @Update({
        "update account",
        "set name_ = #{name,jdbcType=VARCHAR},",
          "email_ = #{email,jdbcType=VARCHAR},",
          "phone_number_ = #{phoneNumber,jdbcType=VARCHAR},",
          "active_ = #{active,jdbcType=BIT},",
          "member_since_ = #{memberSince,jdbcType=TIMESTAMP},",
          "password_hash_ = #{passwordHash,jdbcType=VARCHAR},",
          "photo_url_ = #{photoUrl,jdbcType=VARCHAR}",
        "where id_ = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Account record);
}
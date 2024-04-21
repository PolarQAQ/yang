package org.example.sringbootmybatis_.mapper;

import org.apache.ibatis.annotations.*;
import org.example.sringbootmybatis_.pojo.Emp;
import org.example.sringbootmybatis_.pojo.User;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */
@Mapper
public interface Empi {

//    @Select("select * from tb_emp")
    List<User> list();

//    @Delete("delete from tb_emp where id = #{id}")
    void delete(Integer id);

//    @Insert("insert into tb_emp(name, gender, entrydate, crate_time, update_time, username, job) values (#{name}, #{gender}, #{entrydate}, #{crateTime}, #{updateTime}, #{username}, #{job})")
    void insert(Emp emp);

//    @Update("update tb_emp set name=#{name}, gender=#{gender},entrydate=#{entrydate},crate_time=#{crateTime},update_time=#{updateTime},username=#{username},job=#{job} where id = #{id}")
    void update(Emp emp);

}

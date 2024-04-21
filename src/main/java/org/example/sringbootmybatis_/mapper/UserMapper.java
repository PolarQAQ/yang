package org.example.sringbootmybatis_.mapper;

import org.apache.ibatis.annotations.*;
import org.example.sringbootmybatis_.pojo.Emp;
import org.example.sringbootmybatis_.pojo.User;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 */
@Mapper//在运行时会自动生成该接口的实现类对象（代理对象），并将该对象交给IOC容器管理,就可以直接生成实例变量
public interface UserMapper {

    //查询全部的用户信息
    @Select("select * from tb_emp")
    List<User> list();

    @Delete("delete from tb_emp where id = #{id}")
    void delete(Integer id);

    @Insert("insert into tb_emp(name, gender, entrydate, crate_time, update_time, username, job) values (#{name}, #{gender}, #{entrydate}, #{crate_time}, #{update_time}, #{username}, #{job})")
    void insert(Emp emp);

    @Update("update tb_emp set name = #{name} where id = #{id}")
    void update(Emp emp);

}

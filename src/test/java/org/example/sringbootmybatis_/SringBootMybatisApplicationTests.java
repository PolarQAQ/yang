package org.example.sringbootmybatis_;

//import jakarta.annotation.Resource;

import org.example.sringbootmybatis_.mapper.Empi;
import org.example.sringbootmybatis_.mapper.UserMapper;
import org.example.sringbootmybatis_.pojo.Emp;
import org.example.sringbootmybatis_.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SringBootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;//通过注入的方式

    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();
        userList.forEach(System.out::println);
    }

    @Autowired
    private Empi empi;

    /*
     * @description: 通过id删除数据库中的数据
     * @param null:
     * @return
     * @author: Yang
     * @date: 2024/4/18 21:30
     */

    @Test
    public void testDelete() {
//        Emp emp = new Emp();
        empi.delete(3);
    }

    /*
     * @description: 向数据库中插入数据，因为表中的id是自增长，所以传入null
     * @param null:
     * @return
     * @author: Yang
     * @date: 2024/4/18 21:29
     */

    @Test
    public void testInsert() {
        empi.insert(new Emp(null,"ymy", (short) 1, LocalDate.now(), LocalDateTime.now(), LocalDateTime.now(), "ymy", 5));
    }

    /*
     * @description: 更新数据表中的内容（通过emp中的id来查找）
     * @param null:
     * @return
     * @author: Yang
     * @date: 2024/4/18 21:28
     */
    @Test
    public void testUpdate() {
        Emp emp = new Emp(10,"wang", (short) 2, LocalDate.now(),LocalDateTime.now(), LocalDateTime.now(), "yang", 5);
        empi.update(emp);
    }

}

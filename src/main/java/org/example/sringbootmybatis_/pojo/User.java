package org.example.sringbootmybatis_.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO
 * @author: yang
 * @date: 2024/4/17 20:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private short age;
    private short gender;
    private String phone;
}

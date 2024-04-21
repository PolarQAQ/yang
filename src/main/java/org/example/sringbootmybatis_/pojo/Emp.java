package org.example.sringbootmybatis_.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @description: TODO 
 * @author: yang
 * @date: 2024/4/18 8:31
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    private Integer id;
    private String  name;
    private short gender;
    private LocalDate entrydate;
    private LocalDateTime crateTime;
    private LocalDateTime updateTime;
    private String username;
    private int job;


}

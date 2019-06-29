package com.joah.springboot.user.domain;

import com.joah.springboot.user.enums.UserSexEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * User表的实体类
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer user_id;
    private String user_name;
    private String user_pwd;
    private UserSexEnum user_sex;

    public User(Integer user_id, String user_name, String user_pwd, UserSexEnum user_sex) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_sex = user_sex;
    }
}

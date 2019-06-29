package com.joah.springboot.user.parm;

import lombok.Data;

@Data
public class UserParam extends PageParam {

    private String user_name;
    private String user_sex;

}

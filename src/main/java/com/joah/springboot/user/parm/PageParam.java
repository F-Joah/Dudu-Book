package com.joah.springboot.user.parm;

import lombok.Data;

@Data
public class PageParam {

    private int beginLine;              //起始行
    private Integer pageSize = 3;       //每页显示行数
    private Integer currentPage=0;      // 当前页

}

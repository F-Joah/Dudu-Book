package com.joah.springboot.user.mapper;

import com.joah.springboot.user.domain.User;
import com.joah.springboot.user.parm.UserParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

//    List<User> getAll();
//    List<User> getList(UserParam userParam);
//    int getCount(UserParam userParam);
    User getOne(Long user_id);
//    void insert(User user);
//    int update(User user);
//    int delete(Long user_id);

}

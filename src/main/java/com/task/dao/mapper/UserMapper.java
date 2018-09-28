package com.task.dao.mapper;


import java.util.List;

import com.task.entity.User;
import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    int deleteById(String id);

    int insert(User record);

    User selectById(String id);

    User selectByAccountAndPassword(@Param("account") String account, @Param("password") String password);

    User selectByAccount(@Param("account") String account);

    int updateById(User record);

    void updatePassword(@Param("userId") String userId, @Param("password") String password);

    List<User> selectAll();
}

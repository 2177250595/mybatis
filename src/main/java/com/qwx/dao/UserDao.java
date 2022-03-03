package com.qwx.dao;

import com.qwx.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> findAll();

     User findUser();

     User findByUser(User user);

     User findByMap(Map map);

     User findByCondition(@Param("id") Integer id, @Param("username") String username);

//     新增数据
     void insertUser(User user);

//     删除数据
     void deleteById(Integer id);

//     修改数据
     void updataUser(User user);

}

package com.qwx;

import com.qwx.dao.UserDao;
import com.qwx.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {
        //定义mybatis配置文件的路径
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //传入对应配置文件的输入流，读取配置文件获得 SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过SqlSessionFactory获取Sqlsession对象（理解为一个数据库连接）
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取UserDao实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //调用方法测试
//        测试单参数查询
        List<User> userList = userDao.findAll();
        for (User user:userList){
            System.out.println(user);
        }
       // User user = userDao.findByUser(new User(2, "PDD", 25, "上海"));

//        Map map=new HashMap();
//        map.put("id",2);
//        map.put("username","PDD");
//        map.put("age",25);
//        map.put("address","上海");
//
//        User user = userDao.findByMap(map);
//        System.out.println(user);

//        测试多参数查询
//        User user=userDao.findByCondition(2,"PDD");
//        System.out.println(user);

//        测试char数据
//            userDao.insertUser(new User(3,"若风",35,"上海"));

//        测试删除数据
//            userDao.deleteById(3);
            
//            测试修改数据
//            userDao.updataUser(new User(2,"pdd",20,"shanghai"));
//            提交事物
//        sqlSession.commit();



        //System.out.println(userList);
        //System.out.println(userDao.findUser());
        //System.out.println(user);

        //释放资源
        sqlSession.close();
    }
}

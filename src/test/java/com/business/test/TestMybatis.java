package com.business.test;

import com.business.dao.UserMapper;
import com.business.domain.Book;
import com.business.domain.User;
import com.business.service.ServiceUser;
import com.business.service.impl.ServiceUserImpl;
//import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pei on 2016/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
//    private static Logger logger = Logger.getLogger(TestMybatis.class);
    ApplicationContext context=null;
    @Resource
    ServiceUser serviceUserImpl;
    @Resource
    UserMapper userMapper;
 /*   @Before
    public void before(){
        context= new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
         serviceUserImpl = (ServiceUser) context.getBean("serviceUserImpl");
        userMapper= (UserMapper) context.getBean("userMapper");
    }*/
    @Test
    public void test1(){
        User user = serviceUserImpl.getUserAllInfoById(2);
        System.out.println(user);


    }
    @Test
    public void test2(){
      /*  User user = userMapper.selectUserProduct(1);
        System.out.println(user);*/
        Map map=new HashMap<>();
//        map.put("username","shan");
        List user = userMapper.selectUserAllInfo(map);

        System.out.println(user);
    }

}

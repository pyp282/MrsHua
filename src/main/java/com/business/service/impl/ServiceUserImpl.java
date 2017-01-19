package com.business.service.impl;

import com.business.dao.UserMapper;
import com.business.domain.User;
import com.business.service.ServiceUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by pei on 2016/5/30.
 */
@Service
public class ServiceUserImpl implements ServiceUser {

    @Resource
    UserMapper userdao;
    @Override
    public User getUserById(int id) {
       return userdao.selectByPrimaryKey(id);
    }

    @Override
    public void insert(User user) {
        userdao.insert(user);
    }

    @Override
    public void deleteById(Integer id) {
        userdao.deleteByPrimaryKey(id);
    }

    @Override
    public void updateById(User user) {
        userdao.updateByPrimaryKey(user);
    }

    @Override
    public List<User> getAll() {
        return userdao.selectAll();
    }

    @Override
    public User getUserProduct(Integer id) {

        User user = userdao.selectUserProduct(id);

        return user;
    }

    @Override
    public List<User> getUserAllInfo(Map map) {
        return userdao.selectUserAllInfo(map);
    }

    @Override
    public User getUserAllInfoById(Integer id) {
        return userdao.selectUserAllInfoById(id);
    }

}

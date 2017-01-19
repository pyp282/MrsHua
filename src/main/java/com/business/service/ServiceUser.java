package com.business.service;

import com.business.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Created by pei on 2016/5/30.
 */
public interface ServiceUser {
    User getUserById(int id );
    void insert(User user);
    void deleteById(Integer id);
    void updateById(User user);
    List<User> getAll();
    User getUserProduct(Integer id);
    List<User> getUserAllInfo(Map map);
    User getUserAllInfoById(Integer id);
}

package com.demo.dao.impl;

import com.shop.bean.User;
import com.shop.dao.BaseDao;
import com.shop.dao.UserDao;

/**
 * @author WuLiangHang
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "SELECT `id`, `username`, `password`, `email` FROM user WHERE `username` = ?";
        return super.queryForOne(User.class, sql, username);

    }
    @Override
    public int add(User user){
        String sql = " insert into user (username,password, email) values (?,?,?)";
        Object [] obj ={user.getUsername(),user.getPassword(),user.getEmail() };
     return super.update(sql,obj);
    }

}

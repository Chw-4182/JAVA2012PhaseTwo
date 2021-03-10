package com.shop.test;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;
import org.junit.Test;

/**
 * @author WuLiangHang
 */
public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername(){
        System.out.println(userDao.queryUserByUsername("chw_01").getPassword());
    }
}

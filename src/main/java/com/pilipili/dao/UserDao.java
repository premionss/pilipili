package com.pilipili.dao;

/**
 * Create by misty on 2019/12/24 11:37
 */
public interface UserDao {

    public User selectUserByAccountAndPwd(String account,String password);



}

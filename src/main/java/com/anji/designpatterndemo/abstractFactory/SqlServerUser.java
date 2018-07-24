package com.anji.designpatterndemo.abstractFactory;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:27
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert() {
        System.out.println("insert into sqlserver");
    }

    @Override
    public void getById() {
        System.out.println("get user by id from sqlsever");
    }
}

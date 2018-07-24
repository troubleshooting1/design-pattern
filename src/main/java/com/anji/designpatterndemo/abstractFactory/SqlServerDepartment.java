package com.anji.designpatterndemo.abstractFactory;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:28
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert() {
        System.out.println("insert department into sqlserver");
    }

    @Override
    public void getDepartmentById() {
        System.out.println("get department in sqlserver by id");
    }
}

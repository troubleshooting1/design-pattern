package com.anji.designpatterndemo.abstractFactory;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:33
 */
public class test {
    public static void main(String[] args) {
        IFacfory facfory = new AccessFactory();
        IUser user = facfory.createUser();
        IDepartment department = facfory.createDepartment();
        user.insert();
        user.getById();
        department.insert();
        department.getDepartmentById();
    }
}

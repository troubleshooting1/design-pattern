package com.anji.designpatterndemo.abstractFactory;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:24
 */
public interface IFacfory {
    public IUser createUser();
    public IDepartment createDepartment();
}

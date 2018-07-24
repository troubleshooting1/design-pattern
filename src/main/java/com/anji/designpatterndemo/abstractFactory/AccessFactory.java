package com.anji.designpatterndemo.abstractFactory;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:32
 */
public class AccessFactory implements IFacfory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}

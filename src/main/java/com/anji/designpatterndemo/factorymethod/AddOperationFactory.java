package com.anji.designpatterndemo.factorymethod;

import com.anji.designpatterndemo.staticfactorymethod.AddOperation;
import com.anji.designpatterndemo.staticfactorymethod.Operation;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:18
 */
public class AddOperationFactory implements IFractory {
    @Override
    public Operation generateOper() {
        return new AddOperation();
    }
}

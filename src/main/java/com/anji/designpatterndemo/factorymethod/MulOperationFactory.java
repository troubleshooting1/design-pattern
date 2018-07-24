package com.anji.designpatterndemo.factorymethod;

import com.anji.designpatterndemo.staticfactorymethod.MulOperation;
import com.anji.designpatterndemo.staticfactorymethod.Operation;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:19
 */
public class MulOperationFactory implements IFractory {
    @Override
    public Operation generateOper() {
        return new MulOperation();
    }
}

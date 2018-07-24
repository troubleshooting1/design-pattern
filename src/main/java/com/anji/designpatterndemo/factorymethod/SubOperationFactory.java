package com.anji.designpatterndemo.factorymethod;

import com.anji.designpatterndemo.staticfactorymethod.Operation;
import com.anji.designpatterndemo.staticfactorymethod.SubOperation;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:19
 */
public class SubOperationFactory implements IFractory {
    @Override
    public Operation generateOper() {
        return new SubOperation();
    }
}

package com.anji.designpatterndemo.factorymethod;

import com.anji.designpatterndemo.staticfactorymethod.DivOperation;
import com.anji.designpatterndemo.staticfactorymethod.Operation;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:19
 */
public class DivOperationFactory implements IFractory {
    @Override
    public Operation generateOper() {
        return new DivOperation();
    }
}

package com.anji.designpatterndemo.staticfactorymethod;

/**
 * Description:
 * author: chenqiang
 * date: 2018/7/2 15:04
 */
public class OperationFactory {
    public static Operation getOperation(String quotaFlag) {
        Operation o = null;
        switch (quotaFlag) {
            case "+":
                o = new AddOperation();
                break;
            case "-":
                o = new SubOperation();
                break;
            case "*":
                o = new MulOperation();
                break;
            case "/":
                o = new DivOperation();
                break;
            default:
                break;
        }
        return o;
    }
}

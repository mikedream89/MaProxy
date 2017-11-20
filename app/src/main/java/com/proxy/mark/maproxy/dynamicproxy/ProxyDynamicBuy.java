package com.proxy.mark.maproxy.dynamicproxy;

import com.proxy.mark.maproxy.staticproxy.IBuyFood;
import com.proxy.mark.maproxy.staticproxy.MyBuyFood;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author: Mark.
 * Email: mark.ma@elico-crop.com.
 * Created time: 17-11-20.
 * Describe:
 */

public class ProxyDynamicBuy implements InvocationHandler {

    private Object mObject;

    public ProxyDynamicBuy(Object object) {
        this.mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(mObject, args);
        return result;
    }
}

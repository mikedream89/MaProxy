package com.proxy.mark.maproxy.dynamicproxy;

import android.util.Log;

import com.proxy.mark.maproxy.staticproxy.IBuyFood;

/**
 * Author: Mark.
 * Email: mark.ma@elico-crop.com.
 * Created time: 17-11-20.
 * Describe:
 */

public class MyDynamicBuyFood implements IDynamicBuyFood {
    @Override
    public void buyAbc() {
        Log.v("MyBuyFood Dynamic ", "动态代理，购买什么。。。。。");
    }
}

package com.proxy.mark.maproxy.staticproxy;

import android.util.Log;

/**
 * Author: Mark.
 * Email: mark.ma@elico-crop.com.
 * Created time: 17-11-20.
 * Describe:
 */

public class MyBuyFood implements IBuyFood {
    @Override
    public void buyAbc() {
        Log.v("MyBuyFood ", "静态代理，购买什么。。。。。");
    }
}

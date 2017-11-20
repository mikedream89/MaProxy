package com.proxy.mark.maproxy.staticproxy;

/**
 * Author: Mark.
 * Email: mark.ma@elico-crop.com.
 * Created time: 17-11-20.
 * Describe:
 */

public class ProxyBuy implements IBuyFood {

    private MyBuyFood mMyBuyFood;

    public ProxyBuy(MyBuyFood myBuyFood) {
        this.mMyBuyFood = myBuyFood;
    }

    @Override
    public void buyAbc() {
        mMyBuyFood.buyAbc();
    }
}

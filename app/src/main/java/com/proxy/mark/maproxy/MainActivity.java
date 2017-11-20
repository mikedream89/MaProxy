package com.proxy.mark.maproxy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.proxy.mark.maproxy.dynamicproxy.IDynamicBuyFood;
import com.proxy.mark.maproxy.dynamicproxy.MyDynamicBuyFood;
import com.proxy.mark.maproxy.dynamicproxy.ProxyDynamicBuy;
import com.proxy.mark.maproxy.staticproxy.IBuyFood;
import com.proxy.mark.maproxy.staticproxy.MyBuyFood;
import com.proxy.mark.maproxy.staticproxy.ProxyBuy;

import java.lang.reflect.Proxy;

/**代理分为动态代理和静态代理
**http://www.jianshu.com/p/593c78002afc?utm_campaign=maleskine&utm_content=note&utm_medium=pc_all_hots&utm_source=recommendation
**/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //静态代理
        MyBuyFood myBuyFood = new MyBuyFood();
        ProxyBuy proxyBuy = new ProxyBuy(myBuyFood);
        proxyBuy.buyAbc();

        //动态代理
        //构造我自己
        MyDynamicBuyFood myBuyFood1 = new MyDynamicBuyFood();
        //构造一个动态代理
        ProxyDynamicBuy proxyBuy1 = new ProxyDynamicBuy(myBuyFood1);
        //获取被代理类myBuyFood1的ClassLoader
        ClassLoader loader = myBuyFood1.getClass().getClassLoader();
        //动态构造一个代理律师
        IDynamicBuyFood iBuyFood1 = (IDynamicBuyFood) Proxy.newProxyInstance(loader,new Class[]{IDynamicBuyFood.class},proxyBuy1);
        iBuyFood1.buyAbc();

    }

}
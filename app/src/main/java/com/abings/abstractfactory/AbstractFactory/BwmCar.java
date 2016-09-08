package com.abings.abstractfactory.AbstractFactory;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class BwmCar extends Car {
    @Override
    public void run() {
        Log.i("Tag","开着宝马汽车,滴滴---");
    }
}

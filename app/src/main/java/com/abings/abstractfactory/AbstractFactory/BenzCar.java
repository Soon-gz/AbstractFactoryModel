package com.abings.abstractfactory.AbstractFactory;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class BenzCar extends Car {
    @Override
    public void run() {
        Log.i("Tag","开着奔驰汽车,滴滴---");
    }
}

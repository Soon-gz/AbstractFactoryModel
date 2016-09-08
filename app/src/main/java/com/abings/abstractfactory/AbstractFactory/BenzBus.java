package com.abings.abstractfactory.AbstractFactory;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class BenzBus extends Bus {
    @Override
    public void run() {
        Log.i("Tag", "开着奔驰公交车,滴滴---");
    }
}

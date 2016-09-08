package com.abings.abstractfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abings.abstractfactory.AbstractFactory.Bus;
import com.abings.abstractfactory.AbstractFactory.Car;
import com.abings.abstractfactory.AbstractFactory.IFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //宝马工厂
        IFactory iFactory = IFactory.createFactory("Bwm");
        //奔驰工厂
        IFactory iFactory1 = IFactory.createFactory("Benz");

        //宝马系列的公交和汽车
        Bus bus = iFactory.createBus();
        Car car = iFactory.createCar();
        //出厂测试
        bus.run();
        car.run();

        //奔驰系列
        Bus bus1 = iFactory1.createBus();
        Car car1 = iFactory1.createCar();
        //出厂测试
        car1.run();
        bus1.run();

    }
}

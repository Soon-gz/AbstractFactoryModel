package com.abings.abstractfactory.AbstractFactory;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class BenzFactory extends IFactory {
    @Override
    public Bus createBus() {
        return new BenzBus();
    }

    @Override
    public Car createCar() {
        return new BenzCar();
    }
}

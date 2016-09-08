package com.abings.abstractfactory.AbstractFactory;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public class BwmFactory extends IFactory {
    @Override
    public Bus createBus() {
        return new BwmBus();
    }

    @Override
    public Car createCar() {
        return new BwmCar();
    }
}

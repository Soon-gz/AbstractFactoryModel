package com.abings.abstractfactory.AbstractFactory;

/**
 * Created by HaomingXu on 2016/9/8.
 */
public abstract class IFactory {
    public static IFactory createFactory(String type){
        IFactory iFactory = null;
        switch (type){
            case "Bwm":
                iFactory = new BwmFactory();
                break;
            case "Benz":
                iFactory = new BenzFactory();
                break;
        }
        return iFactory;
    }
    public abstract Bus createBus();
    public abstract Car createCar();
}

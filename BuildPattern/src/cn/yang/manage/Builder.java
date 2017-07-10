package cn.yang.manage;

import cn.yang.bean.Car;

/**
 * @author Cool-Coding 2017/7/10
 */
public abstract class Builder {
    protected Car car;

    public Builder(){
        car=new Car();
    }

    public abstract void buildWheels();
    public abstract void buildSteeringWheels();
    public abstract void buildCarBody();

    //生产完成后，车出厂
    public Car getCar(){
        return car;
    }
}

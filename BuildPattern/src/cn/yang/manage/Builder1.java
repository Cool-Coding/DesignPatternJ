package cn.yang.manage;

import cn.yang.bean.Car;

/**
 * @author Cool-Coding 2017/7/10
 */
public class Builder1 extends Builder {
    @Override
    public void buildWheels() {
        car.setWheels("2m");
    }

    @Override
    public void buildSteeringWheels() {
        car.setSteeringWheel("1.5m");
    }

    @Override
    public void buildCarBody() {
        car.setCarBody("长度5m，宽度1.5m");
    }
}

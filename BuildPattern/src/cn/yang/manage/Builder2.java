package cn.yang.manage;

import cn.yang.bean.Car;

/**
 * @author Cool-Coding 2017/7/10
 */
public class Builder2 extends Builder {
    @Override
    public void buildWheels() {
        car.setWheels("10m");
    }

    @Override
    public void buildSteeringWheels() {
        car.setSteeringWheel("3m");
    }

    @Override
    public void buildCarBody() {
        car.setCarBody("长度6m，宽度3m");
    }
}

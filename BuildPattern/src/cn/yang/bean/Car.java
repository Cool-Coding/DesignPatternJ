package cn.yang.bean;

/**
 * @author Cool-Coding 2017/7/10
 */
public class Car {
    private String wheels;//车轮
    private String steeringWheel;//方向盘
    private String carBody;//车身

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    @Override
    public String toString() {
        return "车轮:"+this.wheels+";方向盘:"+this.steeringWheel+";车身:"+this.carBody;
    }
}

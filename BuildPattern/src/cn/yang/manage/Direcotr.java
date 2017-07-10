package cn.yang.manage;

/**
 * @author Cool-Coding 2017/7/10
 */
public class Direcotr {
    Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 按照流程生产汽车(严格来说，生产可以同时进行，也就是说builder方法可以同时进行，组装需要流程)
     * 此处可以理解为按照一定流程组装汽车
     */
    public void build(){
        builder.buildCarBody();
        builder.buildWheels();
        builder.buildSteeringWheels();
    }
}

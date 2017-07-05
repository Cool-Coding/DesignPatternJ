/**
 * Created by Administrator on 2017/7/5.
 */
public class CashContext {
    /**
     * 促销活动处理接口
     */
    private CashSuper cashSuper;

    /**
     *
     * @param strategyType 策略类型(正常，满减，折扣)
     * 这里又结合使用了简单工厂模式，将各种策略类封闭在一个CashContext类中
     * 让前端与业务逻辑区分开
     */
    public CashContext(StrategyType strategyType) {
        switch (strategyType){
            case Normal:
                cashSuper=new CashNormal();
                break;
            case Rebate:
                cashSuper=new CashRebate(0.8f);
                break;
            case Return:
                cashSuper =new CashReturn(300,20);
                break;
        }
    }

    /**
     *
     * @param money 购物总金额
     * @return 返回活动后的金额
     */
    public double discount(double money){
        return cashSuper.discount(money);
    }
}

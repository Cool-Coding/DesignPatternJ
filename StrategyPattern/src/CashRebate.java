/**
 * Created by Administrator on 2017/7/5.
 */
public class CashRebate implements CashSuper {
    /**
     * 折扣率
     */
    private float rate;

    /**
     *
     * @param rate 折扣率
     */
    CashRebate(float rate){
        this.rate=rate;
    }

    /**
     *
     * @param money 购物总金额
     * @return 折扣后的金额
     */
    @Override
    public double discount(double money) {
        return money*rate;
    }
}

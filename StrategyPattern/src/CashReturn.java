/**
 * Created by Administrator on 2017/7/5.
 * 满减策略
 */
public class CashReturn implements CashSuper{
    private int sum;
    private int discount;

    /**
     *
     * @param sum       总金额
     * @param discount  折扣金额
     */
    CashReturn(int sum,int discount){
        this.sum=sum;
        this.discount=discount;
    }

    /**
     *
     * @param money 购物总金额
     * @return 返回折扣后的金额
     */
    @Override
    public double discount(double money) {
        return money - Math.floor(money / sum) * discount;
    }
}

/**
 * Created by Administrator on 2017/7/5.
 */
public class CashNormal implements CashSuper {
    @Override
    public double discount(double money) {
        return money;
    }
}

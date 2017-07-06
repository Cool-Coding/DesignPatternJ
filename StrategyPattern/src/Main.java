/**
 * Created by Administrator on 2017/7/5.jj
 * @author cool-coding
 * 策略设计模式，适用于规则经常变化的业务，常见的如促销策略
 */
public class Main {
    public static void main(String args[]){
        CashContext cashContext=new CashContext(StrategyType.Return);
        int result=(int)cashContext.discount(320);
        System.out.println(result);
    }
}

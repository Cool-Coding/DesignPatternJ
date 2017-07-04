/**
 * Created by Administrator on 2017/7/4.
 * author:杨光永
 * 模式:简单工厂模式
 * 优点:可以通过一个类(工厂)封闭不同具体"操作类",使前端逻辑(Main)与业务逻辑分离。
 * 缺点:对于"操作类"经常变化的业务不适用(比如商场促销，经常变换销售策略)，增加维护难度。
 */
public class Main {
    public static void main(String args[]){
        CalcFactory calcFactory=new CalcFactory("*");
        double result=calcFactory.getResult(2,2);
        System.out.println(result);
    }
}

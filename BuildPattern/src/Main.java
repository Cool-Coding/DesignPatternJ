import cn.yang.bean.Car;
import cn.yang.manage.Builder;
import cn.yang.manage.Builder1;
import cn.yang.manage.Builder2;
import cn.yang.manage.Direcotr;

/**
 * @author Cool-Coding 2017/7/10
 */
public class Main {
    public static void main(String args[]){
        Direcotr direcotr=new Direcotr();

        //流程一
        Builder builder1=new Builder1();
        direcotr.setBuilder(builder1);
        direcotr.build();
        Car car1=builder1.getCar();
        System.out.println(car1);

        //流程二
        Builder builder2=new Builder2();
        direcotr.setBuilder(builder2);
        direcotr.build();
        Car car2=builder2.getCar();
        System.out.println(car2);


    }
}

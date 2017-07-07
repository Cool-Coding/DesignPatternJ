/**
 * Created by Administrator on 2017/7/6.
 * @author Cool-Coding
 * 装饰模式将每个装饰封闭成单独的类，而在装饰类中可以关联母装饰类，这样就形成了一个链条，当最后一个装饰
 * 完成输出的时候，就会从链条的第一个装饰类一直输出到最后一个装饰类。第一个装饰类没有母装饰类，使其与被装饰对象关联
 * 其它装饰类与它前一个装饰类关联即可。
 */
public class Main {
    public static void main(String args[]){
        Person person=new Person();
        person.setName("Cool-Coding");

        //第一个装饰节点
        Decorate decorate=new Decorate();
        decorate.setPerson(person);

        //第二个装饰节点
        Decorate decorate1=new ShirtDecorate();
        //第三个装饰节点
        Decorate decorate2=new PantsDecorate();
        //第四个装饰节点
        Decorate decorate3=new SandalDecorate();

        decorate1.setParentDecorate(decorate);
        decorate2.setParentDecorate(decorate1);
        decorate3.setParentDecorate(decorate2);
        decorate3.show();
    }
}

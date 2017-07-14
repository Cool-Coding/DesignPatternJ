import java.awt.event.WindowAdapter;

/**
 * @author Cool-Coding 2017/7/14
 * 命令模式将请求与行为解耦。命令模式有如下优点：
 * 1.能够很容易的设计一个命令对列
 * 2.在需要的情况下，可以很容易地将命令记入日志
 * 3.允许接收请求的一方决定是否拒绝请求
 */
public class Main {
    public static void main(String args[]){
        Waitor waitor=new Waitor();//骋请服务员
        Chef chef=new Chef();//骋请厨师
        Command command=new Command();//开发一个下达命令系统
        command.setChef(chef);//系统与厨师关联
        waitor.setCommand(command);//教服务员使用点餐系统

        //1号桌点了2个鸡翅，3个羊肉串，然后又把3个羊肉串改成了5个羊肉串
        waitor.add(1,Food.jichi,2);
        waitor.add(1,Food.yangrouchuan,3);
        waitor.change(1,Food.yangrouchuan,5);

        //2号桌点了2个鸡翅，3个羊肉串，5个面筋，2瓶啤酒，然后又不要啤酒了
        waitor.add(2,Food.jichi,2);
        waitor.add(2,Food.yangrouchuan,3);
        waitor.add(2,Food.mianjin,5);
        waitor.add(2,Food.pijiu,2);
        waitor.remove(2,Food.pijiu);

        //都点完后，服务员下达命令
        waitor.notifly();

        //结账
        float money=waitor.payTheBill(1);
        System.out.println("1桌:"+money+"元");

        money=waitor.payTheBill(2);
        System.out.println("2桌:"+money+"元");
    }
}

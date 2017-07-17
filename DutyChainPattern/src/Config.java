/**
 * @author Cool-Coding 2017/7/17
 * 配置类，配置了节点规则，以及职责，以及职责链
 */
public class Config {
    /**
     *
     * @return 返回职责链的起始管理者
     */
    public static AbstractManager config(){
        //配置处理节点、处理人；节点与处理人的关联；处理人之间的关联
        Handler handler1=new QJHandler1();
        Handler handler2=new QJHandler2();
        Handler handler3=new QJHandler3();

        AbstractManager leader=new Leader("组长");
        AbstractManager leader2=new Leader("经理");
        AbstractManager leader3=new Leader("总监");
        leader.setHandler(RType.qingjia,handler1);
        leader2.setHandler(RType.qingjia,handler2);
        leader3.setHandler(RType.qingjia,handler3);

        leader.setNetManager(leader2);
        leader2.setNetManager(leader3);

        return leader;
    }
}

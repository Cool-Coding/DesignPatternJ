/**
 * @author Cool-Coding 2017/7/19
 * 访问模式的优点是在不修改类的情况下，改变对对象的操作。其目的是把处理从数据结构中分离出来。
 */
public class Main {
    public static void main(String args[]){
        Context context=new Context();//对象所处的环境

        //对象，一般保持不变
        Person man=new Man("男人");
        Person woman=new Woman("女人");
        context.addPerson(man);
        context.addPerson(woman);

        //行为
        Vistor successVistor=new SuccessVistor("成功");
        context.run(successVistor);

        //行为
        Vistor failVistor=new FailVistor("失败");
        context.run(failVistor);

        //行为
        Vistor loveVistor=new LoveVistor("恋爱");
        context.run(loveVistor);
    }
}

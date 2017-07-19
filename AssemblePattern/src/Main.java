/**
 * @author Cool-Coding 2017/7/13
 * 组合模式: 需求中体现部分与整体层次的结构时，以及希望用户忽略组合对象与单个对象
 * 的不同，统一地使用组合结构中所有对象时，就应该考虑用组合模式。即组合对象与单个对象都具有
 * 相同的操作方法
 */
public class Main {
    public static void main(String args[]){
        Composite composite=new Component("东易日盛集团总部");

        //集团总部职能部门
        Composite leaf=new Leaf("财务部");
        Composite leaf2=new Leaf("信息化");
        composite.add(leaf);
        composite.add(leaf2);

        //分公司
        Composite composite1=new Component("速美超级家");
        Composite leaf3=new Leaf("人力资源");
        Composite leaf4=new Leaf("行政");
        composite1.add(leaf3);
        composite1.add(leaf4);
        composite.add(composite1);

        //分公司
        Composite composite2=new Component("网家科技");
        Composite leaf5=new Leaf("人力资源");
        Composite leaf6=new Leaf("行政");
        composite2.add(leaf5);
        composite2.add(leaf6);
        composite.add(composite2);

        composite.display(1);



    }
}

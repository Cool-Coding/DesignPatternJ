/**
 * @author Cool-Coding 2017/7/13
 */
public class Leaf extends Composite {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Composite composite) {
      System.out.println("这是叶子节点，不能添加其它节点");
    }

    @Override
    public void remove(Composite composite) {
        System.out.println("这是叶子节点!");
    }

    @Override
    public void display(int depth) {
        String info="";
        for(int i=0;i<depth;i++){
            info+="- ";
        }
        System.out.println(info+this.name);
    }
}

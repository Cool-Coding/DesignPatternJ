import java.util.ArrayList;
import java.util.List;

/**
 * @author Cool-Coding 2017/7/13
 */
public class Component extends Composite {
    private List<Composite> compositeList=new ArrayList<Composite>();

    public Component(String name) {
        super(name);
    }

    @Override
    public void add(Composite composite) {
     compositeList.add(composite);
    }

    @Override
    public void remove(Composite composite) {
     compositeList.remove(composite);
    }

    @Override
    public void display(int depth) {
        String info="";
        for(int i =0;i<depth;i++){
            info+="- ";
        }
        System.out.println(info+this.name);

        depth+=2;
        for (Composite component:compositeList) {
            component.display(depth);
        }
    }
}

/**
 * @author Cool-Coding 2017/7/13
 */
public abstract class Composite {
    protected String name;

    public Composite(String name){
        this.name = name;
    }

    public abstract void add(Composite composite);
    public abstract  void remove(Composite composite);
    public abstract  void display(int depth);
}


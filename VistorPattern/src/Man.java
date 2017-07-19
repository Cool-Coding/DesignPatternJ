/**
 * @author Cool-Coding 2017/7/19
 */
public class Man extends Person {

    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.operateMan(this);
    }
}

/**
 * @author Cool-Coding 2017/7/19
 */
public class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.operateWoman(this);
    }
}

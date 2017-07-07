/**
 * @author Cool-Coding 2017/7/7
 */
public abstract class Human{
    protected String name;

    Human(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

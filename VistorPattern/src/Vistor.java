/**
 * @author Cool-Coding 2017/7/19
 */
public abstract class Vistor {
    private String behavior;

    public Vistor(String behavior){
        this.behavior=behavior;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public abstract void operateMan(Person person);
    public abstract void operateWoman(Person person);
}

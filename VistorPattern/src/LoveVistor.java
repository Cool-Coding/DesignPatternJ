/**
 * @author Cool-Coding 2017/7/19
 */
public class LoveVistor extends Vistor {
    public LoveVistor(String behavior) {
        super(behavior);
    }

    @Override
    public void operateMan(Person person) {
        System.out.println(person.getName()+this.getBehavior()+"时，凡事不懂也要装懂");
    }

    @Override
    public void operateWoman(Person person) {
        System.out.println(person.getName()+this.getBehavior()+"时，遇事懂也装作不懂");
    }
}

/**
 * @author Cool-Coding 2017/7/19
 */
public class FailVistor extends Vistor {
    public FailVistor(String behavior) {
        super(behavior);
    }

    @Override
    public void operateMan(Person person) {
        System.out.println(person.getName()+this.getBehavior()+"时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void operateWoman(Person person) {
        System.out.println(person.getName()+this.getBehavior()+"时，眼泪汪汪，谁也劝不了");
    }
}

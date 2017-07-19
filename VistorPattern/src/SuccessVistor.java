/**
 * @author Cool-Coding 2017/7/19
 */
public class SuccessVistor extends Vistor {
    public SuccessVistor(String behavior) {
        super(behavior);
    }


    @Override
    public void operateMan(Person person) {
        System.out.println(person.getName()+this.getBehavior()+"时，背后多半有一个伟大的女人");
    }

    @Override
    public void operateWoman(Person person) {
        System.out.println(person.getName()+this.getBehavior()+"时，背后大多有一个不成功的男人");
    }
}

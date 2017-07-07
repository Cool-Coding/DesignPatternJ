/**
 * Created by Administrator on 2017/7/7.
 */
public class Pursuer extends Human implements PursuitMM {

    Pursuer(String name) {
        super(name);
    }

    @Override
    public void sendFlower(Girl girl) {
        System.out.println(name+"送花给"+girl.getName());
    }

    @Override
    public void feast(Girl girl) {
        System.out.println(name+"请客"+girl.getName());
    }

    @Override
    public void watchFilm(Girl girl) {
        System.out.println(name+"请"+girl.getName()+"看电影");
    }

    @Override
    public void travel(Girl girl) {
        System.out.println(name+"请"+girl.getName()+"旅游");
    }
}

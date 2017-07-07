import java.net.HttpURLConnection;

/**
 * Created by Administrator on 2017/7/7.
 */
public class Proxyer extends Human implements PursuitMM {
    private Pursuer pursuer;

    Proxyer(String name) {
        super(name);
    }

    public Pursuer getPursuer() {
        return pursuer;
    }

    public void setPursuer(Pursuer pursuer) {
        this.pursuer = pursuer;
    }

    @Override
    public void sendFlower(Girl girl) {
        System.out.print(name+"代替");
        pursuer.sendFlower(girl);
    }

    @Override
    public void feast(Girl girl) {
        System.out.print(name+"代替");
        pursuer.feast(girl);
    }

    @Override
    public void watchFilm(Girl girl) {
        System.out.print(name+"代替");
        pursuer.watchFilm(girl);
    }

    @Override
    public void travel(Girl girl) {
        System.out.print(name+"代替");
        pursuer.travel(girl);
    }
}

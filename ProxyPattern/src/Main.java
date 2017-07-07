/**
 * Created by Administrator on 2017/7/7.
 * 代理模式是大家比较熟悉的一种模式，按照字面意思来说就是代理别人做某件事情。
 * 代理模式代理真实对象类，他与真实对象类实现了同样的接口，并且代理类有一个真实对象类的引用，
 * 在代理类内部再用真实类处理事情。这样可以在真实类处理事情之前代理类可以添加一些附加的功能，比如校验，权限判断等。
 */
public class Main {

    public static void main(String args[]){
        Girl girl=new Girl("晓梅");
        Pursuer pursuer=new Pursuer("李明");
        Proxyer proxyer=new Proxyer("陈扬");
        proxyer.setPursuer(pursuer);
        proxyer.sendFlower(girl);
        proxyer.travel(girl);
        proxyer.watchFilm(girl);
        proxyer.feast(girl);
    }
}

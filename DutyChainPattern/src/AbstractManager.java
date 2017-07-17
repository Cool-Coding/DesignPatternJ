import java.util.HashMap;
import java.util.Map;

/**
 * @author Cool-Coding 2017/7/17
 * 抽象管理者类，里面包括当前管理者姓名;下一个管理者;当前管理者包含地处理类
 */
public abstract class AbstractManager {
    protected  AbstractManager manager;
    protected  String name;
    private    Map<RType,Handler> handlerList;

    public AbstractManager(String name){
        handlerList=new HashMap<>();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNetManager(AbstractManager manager){
        this.manager=manager;
    }

    public void setHandler(RType type,Handler handler){
        handlerList.put(type,handler);
    }

    public Handler getHandler(RType type){
        return handlerList.get(type);
    }

    public abstract void handle(Request request);
}

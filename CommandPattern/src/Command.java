import java.util.Map;

/**
 * @author Cool-Coding 2017/7/14
 */
public class Command {
    private Chef chef;

    public void setChef(Chef chef){
        this.chef=chef;
    }

    public void run(Map<Integer,Order> orderEntry){
        chef.run(orderEntry);
    }
}

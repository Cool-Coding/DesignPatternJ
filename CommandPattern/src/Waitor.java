import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Cool-Coding 2017/7/14
 */
public class Waitor {
    private Map<Integer,Order> orderList;
    private Command command;

    public Waitor(){
        orderList=new HashMap<>();
    }

    public void add(int tableNo,Food food,Integer amount){
        Order order;
        if(orderList.containsKey(tableNo)){
            order=orderList.get(tableNo);
            order.add(food,amount);
        }else{
            order=new Order();
            order.add(food,amount);
            orderList.put(tableNo,order);
        }
    }

    public void remove(int tableNo){
        orderList.remove(tableNo);
    }

    public void remove(int tableNo,Food food){
        Order order=orderList.get(tableNo);
        order.remove(food);
    }

    public void change(int tableNo,Food food,Integer amount){
        Order order=orderList.get(tableNo);
        if (order!=null) order.change(food,amount);
    }

    public void notifly(){
        command.run(orderList);
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public float payTheBill(int tableNo){
        Order order=orderList.get(tableNo);
        if (order==null)return 0;
        return order.payTheBill();
    }


}

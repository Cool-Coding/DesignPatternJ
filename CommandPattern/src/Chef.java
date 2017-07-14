import java.util.HashMap;
import java.util.Map;

/**
 * @author Cool-Coding 2017/7/14
 */
public class Chef {
    public void run(Map<Integer,Order> orderEntry){
        Food food;
        Map<Food,Integer> foodIntegerMap=new HashMap<>();
        for(Order order:orderEntry.values()){
            for(Map.Entry<Food,Integer> foodIntegerEntry:order.getFoods()){
                if(foodIntegerMap.containsKey(foodIntegerEntry.getKey())){
                    food=foodIntegerEntry.getKey();
                    foodIntegerMap.replace(food,foodIntegerMap.get(food)+foodIntegerEntry.getValue());
                }else{
                    foodIntegerMap.put(foodIntegerEntry.getKey(),foodIntegerEntry.getValue());
                }
            }
        }

        for(Map.Entry<Food,Integer> foodIntegerEntry:foodIntegerMap.entrySet()) {
            food = foodIntegerEntry.getKey();
            switch (food) {
                case jichi: {
                    System.out.println("烤鸡翅" + foodIntegerEntry.getValue() + "根");
                }
                break;
                case pijiu: {
                    System.out.println("拿啤酒" + foodIntegerEntry.getValue() + "瓶");
                }
                break;
                case mianjin: {
                    System.out.println("烤面筋" + foodIntegerEntry.getValue() + "个");
                }
                break;
                case yangrouchuan: {
                    System.out.println("烤羊肉串" + foodIntegerEntry.getValue() + "串");
                }
                break;
            }
        }

        System.out.println("**********************************************************");
        //做好饭后
        for(Map.Entry<Integer,Order> orderEntry1:orderEntry.entrySet()){
            System.out.println(orderEntry1.getKey()+"桌:"+orderEntry1.getValue());
        }

    }
}

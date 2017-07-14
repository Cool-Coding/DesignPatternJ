import java.util.*;


/**
 * @author Cool-Coding 2017/7/14
 */
public class Order {
    private Map<Food,Integer> foodList;
    public Order() {
        this.foodList = new HashMap<>();
    }

    //添加食物
    public void add(Food food,int amount){
        foodList.put(food,amount);
    }

    //删除食物
    public void remove(Food food){
        foodList.remove(food);
    }

    //更改食物
    public void change(Food food,int amount){
        foodList.replace(food,amount);
    }


    //结算
    public float payTheBill(){
        float money=0;
        for (Map.Entry<Food,Integer> foodEntry:foodList.entrySet()) {
            money=money+foodEntry.getKey().getPrice()*foodEntry.getValue();
        }

        return money;
    }

    /**
     *
     * @return 返回食物名称与数量信息
     */
    public Set<Map.Entry<Food,Integer>> getFoods(){
        return foodList.entrySet();
    }

    @Override
    public String toString() {
        String str="";
        for(Map.Entry<Food,Integer> foodIntegerEntry:foodList.entrySet()) {
            str += foodIntegerEntry.getKey().toString() + ":" + foodIntegerEntry.getValue() + "/";
        }
        str=str.substring(0,str.length()-1);
        return str;
    }
}

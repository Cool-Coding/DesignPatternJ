import java.util.ArrayList;
import java.util.List;

/**
 * @author Cool-Coding 2017/7/19
 */
public class Context {
    private List<Person> personList;

    public Context(){
        personList=new ArrayList<>();
    }

    /**
     * 添加对象
     * @param person
     */
    public void addPerson(Person person){
        personList.add(person);
    }

    /**
     * 删除对象
     * @param person
     */
    public void removePerson(Person person){
        personList.remove(person);
    }

    /**
     * 执行作用于对象上的行为
     * @param vistor
     */
    public void run(Vistor vistor){
        for(Person person:personList){
            person.accept(vistor);
        }
    }
}

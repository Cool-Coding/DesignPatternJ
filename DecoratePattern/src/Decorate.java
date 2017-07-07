/**
 * Created by Administrator on 2017/7/6.
 * @author Cool-Coding
 */
public class Decorate{
    private Person person;
    protected Decorate parentDecorate;

    public void setPerson(Person person){
        this.person=person;
    }

    public void setParentDecorate(Decorate parentDecorate){
        this.parentDecorate = parentDecorate;
    }
    public void show(){
        System.out.print(person.getName()+"今天穿");
        if (parentDecorate != null) parentDecorate.show();
    }
}

/**
 * Created by Administrator on 2017/7/6.
 */
public class Decorate{
    private Person person;
    protected Decorate decorate;

    public final void setPerson(Person person){
        this.person=person;
    }

    public void setDecorate(Decorate decorate){
        this.decorate=decorate;
    }
    public void show(){
        System.out.print(person.getName()+"今天穿");
        if (decorate != null) decorate.show();
    }
}

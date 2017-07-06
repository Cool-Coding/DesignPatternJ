/**
 * Created by Administrator on 2017/7/6.
 */
public class Main {
    public static void main(String args[]){
        Person person=new Person();
        person.setName("Cool-Coding");

        Decorate decorate=new Decorate();
        decorate.setPerson(person);

        Decorate decorate1=new ShirtDecorate();
        Decorate decorate2=new PantsDecorate();
        Decorate decorate3=new SandalDecorate();

        decorate1.setDecorate(decorate);
        decorate2.setDecorate(decorate1);
        decorate3.setDecorate(decorate2);
        decorate3.show();
    }
}

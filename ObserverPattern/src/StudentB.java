/**
 * @author Cool-Coding 2017/7/10
 */
public class StudentB {
    private String name;
    private Subject subject;

    public StudentB(Subject subject){
        this.subject=subject;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void IsDoing(){
        System.out.println(name+"正在踢足球!");
    }

    public void EmergencyToDo(String message){
        System.out.println(message+subject.state+name+"不踢了，回到了教室!");
    }
}

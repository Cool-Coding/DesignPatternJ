/**
 * @author Cool-Coding 2017/7/10
 */
public class StudentA {
    private String name;
    private Subject subject;

    public StudentA(Subject subject){
        this.subject=subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void IsDoing(){
        System.out.println(name+"正在玩游戏!");
    }

    public void Emergency(String message){
        System.out.println(message+subject.state+name+"关掉了游戏!");
    }
}

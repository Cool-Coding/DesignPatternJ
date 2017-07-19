import javafx.event.*;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 * @author Cool-Coding 2017/7/10
 * 观察者模式也被称为发布/订阅模式；定义了一种一对多的依赖关系,让多个观察者同时监听一个主题，
 * 当主题状态发生改变时，通知所有观察者让观察者能够自动更新；解决了需要相互协作的类一致性问题
 */
public class Main {
    public static void main(String[] args){
        SubSubject subject=new SubSubject();
        StudentA studentA=new StudentA(subject);
        studentA.setName("李明");

        StudentB studentB=new StudentB(subject);
        studentB.setName("晓华");

        subject.state="老师来了,";
        String message="";
        subject.addLister(studentA,"Emergency",message);
        subject.addLister(studentB,"EmergencyToDo",message);

        studentA.IsDoing();
        studentB.IsDoing();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        subject.notifly();
    }
}

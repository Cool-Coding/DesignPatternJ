import java.util.ArrayList;
import java.util.List;

/**
 * @author Cool-Coding 2017/7/10
 * 事件处理类
 */
public class EventHandler  {
    private List<Event> events;

    public EventHandler(){
        events =new ArrayList<Event>();
    }

    public void addEvent(Event event){
        events.add(event);
    }

    public void notifly() throws Exception{
        for(Event event: events){
            event.invoke();
        }
    }
}

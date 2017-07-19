/**
 * @author Cool-Coding 2017/7/10
 */
public class SubSubject extends Subject {
    private EventHandler eventHandler;


    SubSubject(){
        eventHandler=new EventHandler();
    }

    public void addLister(Object object,String methodName,Object... params){
        eventHandler.addEvent(new Event(object,methodName,params));
    }

    @Override
    public void notifly(){
        try {
            eventHandler.notifly();
        }catch (Exception e){
            System.out.println(e);
            return;
        }
    }
}

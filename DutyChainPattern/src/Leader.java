import java.util.Map;

/**
 * @author Cool-Coding 2017/7/17
 * 此类是管理者对象类，里面包括了具体地处理方法(此处所有管理者对象可以用这一个类)
 */
public class Leader extends AbstractManager{


    public Leader(String name) {
        super(name);
    }

    @Override
    public void handle(Request request) {
      Handler handler=getHandler(request.getType());
      if (handler!=null){
          try {
            boolean result=handler.handle(request);
            if (!result) {
                if(manager!=null)
                manager.handle(request);
                else{
                    System.out.println(this.getName()+"没通过批准");
                }
            }
            else{
                System.out.println(this.getName()+"批准了");
            }
          } catch (Exception e) {
              System.out.print(e.getMessage());
          }
      }
      else{
          System.out.println(this.getName()+"处理类配置列表中没有"+request.getType()+"类型");
      }
    }
}

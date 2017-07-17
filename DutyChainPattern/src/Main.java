/**
 * @author Cool-Coding 2017/7/17
 */
public class Main {
    public static void main(String args[]){
        //初始配置
        AbstractManager leader=Config.config();

        //客户端生成请求
        Request request=new Request();
        request.setType(RType.qingjia);
        request.setContent("由于家里有事，小明请假");
        request.setAmount(10);

        leader.handle(request);
    }
}

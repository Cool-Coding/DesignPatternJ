/**
 * @author Cool-Coding 2017/7/17
 */
public class QJHandler3 extends Handler {
    @Override
    public boolean handle(Request request) throws Exception {
        if (request.getType() == RType.qingjia) {
            if (request.getAmount() >=5 && request.getAmount() < 10) {
                //System.out.println("批准了");消息不在规则类中显示
                return true;
            }else{
                //System.out.println("请假超过10天，不批准!");消息不在规则类中显示
                return false;
            }
        }else{
            throw new Exception(RType.qingjia+"类型处理代码不能处理"+request.getType()+"类型");
        }
    }
}

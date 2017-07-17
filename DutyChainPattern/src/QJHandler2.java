/**
 * @author Cool-Coding 2017/7/17
 */
public class QJHandler2 extends Handler {
    @Override
    public boolean handle(Request request) throws Exception {
        if (request.getType() == RType.qingjia) {
            if (request.getAmount() >=3 && request.getAmount() < 5) {
                //System.out.println("批准了");消息不在规则类中显示
                return true;
            }else{
                return false;
            }
        }else{
            throw new Exception(request.getType()+":不是"+RType.qingjia+"类型");
        }
    }
}

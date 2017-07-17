/**
 * @author Cool-Coding 2017/7/17
 */
public class Request {
    private RType type;//请求类型
    private String content;//请求内容
    private Integer amount;//数值

    public RType getType() {
        return type;
    }

    public void setType(RType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

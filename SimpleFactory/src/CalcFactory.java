/**
 * Created by Administrator on 2017/7/4.
 */
public class CalcFactory {

    private CalcFactory() {}

    /**
     * @param ope 操作符号(+,-,*,/)
     */
    public static Operation getOperation(String ope){
        Operation operation=null;
        switch (ope) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationMinus();
                break;
            case "*":
                operation = new OperationMultiply();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }

        return operation;
    }
}

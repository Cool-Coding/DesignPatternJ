/**
 * Created by Administrator on 2017/7/4.
 */
public class CalcFactory {
    private Operation operation;

    /**
     * @param ope 操作符号(+,-,*,/)
     */
    public CalcFactory(String ope) {
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
    }

    /**
     *
     * @param num1 操作符左边的数
     * @param num2 操作符右边的数
     * @return 返回计算的结果
     */
     public double getResult(double num1,double num2){
         return operation.calc(num1,num2);
    }
}

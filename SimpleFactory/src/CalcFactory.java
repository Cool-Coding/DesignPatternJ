/**
 * Created by Administrator on 2017/7/4.
 */
public class CalcFactory {
    private Operation operation;
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

     public double getResult(double num1,double num2){
         return operation.calc(num1,num2);
    }
}

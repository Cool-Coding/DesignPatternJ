/**
 * Created by Administrator on 2017/7/4.
 */
public class OperationDiv implements Operation{
    @Override
    public double calc(double numb1, double num2) {
        if (num2==0)
            return 0;
        else
            return numb1 / num2;
    }
}

/**
 * @author Cool-Coding 2017/7/6
 */
public class PantsDecorate extends Decorate {
    @Override
    public void show() {
        parentDecorate.show();
        System.out.print("短裤");

    }
}

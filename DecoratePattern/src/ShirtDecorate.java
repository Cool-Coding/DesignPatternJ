/**
 * @author Cool-Coding 2017/7/6
 */
public class ShirtDecorate extends Decorate {
    @Override
    public void show() {
        parentDecorate.show();
        System.out.print("衬衫");
    }
}

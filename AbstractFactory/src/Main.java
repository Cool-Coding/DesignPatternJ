import cn.yang.bean.User;
import cn.yang.db.IUser;
import cn.yang.factory.IAbstractFactory;
import cn.yang.factory.MysqlFactory;
import cn.yang.factory.OracleFactory;

/**
 * Created by Administrator on 2017/7/6.
 * @author Cool-Coding
 * 抽像工厂模式按照数据库个数实例出多个数据库相关的具体工厂，然后具体工厂中再实例出具体的产品操作类
 * 好处是非常便于切换数据库产品，而且客户端与产品具体操作类分隔开，只需要选择使用哪个工厂即可。
 * 缺点是如果增加产品，需要一个产品BEAN类，三个产品操作类，还需要修改各个数据库工厂，很麻烦。
 * 可以结合简单工厂模式，只需要定义一个工厂，里面有获取产品操作类方法，将具体产品操作类封闭在里面，
 * 根据不同的数据库实例化不同的产品操作类。但是这样的缺点是如果改为数据库，则需要在每一个获取产品操作方法中
 * 修改，也是很不方便。此时可以用反射，根据数据库不同自动实例不同的产品操作类。
 */
public class Main {

    public static void main(String args[]) {

        User user = new User();
        user.setName("ab");
        user.setAge(12);

        //mysql数据库时
        IAbstractFactory iAbstractFactory = new MysqlFactory();
        IUser iUser = iAbstractFactory.createDBUser();
        boolean result= iUser.insert(user);
        if (result){
            System.out.println("插入用户成功!");
        }

        //连接Oracle数据库时
        IAbstractFactory iAbstractFactory1=new OracleFactory();
        IUser iUser1=iAbstractFactory1.createDBUser();
        boolean result1=iUser1.insert(user);
        if (result){
            System.out.println("插入用户成功!");
        }



}
}

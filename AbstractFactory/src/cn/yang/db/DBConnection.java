package cn.yang.db;

/**
 * Created by Administrator on 2017/7/6.
 * 定义为抽像类是不可以被实例化
 */
public abstract class DBConnection {
    private String mysqlparams="xxxxxx";//连接mysql数据库的连接参数(可通过配置文件)
    private String oracleparams="xxxxx";//连接Oracle数据库的连接参数(可通过配置文件)
    protected DBConnection(String dbname){
        switch (dbname){
            case "mysql":
                //连接Mysql数据库
                break;
            case "oracle":
                //连接Oracle数据库
                break;
        }
    }

}

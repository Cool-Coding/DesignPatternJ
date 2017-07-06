package cn.yang.db;

import cn.yang.bean.User;
import cn.yang.constant.Constant;

/**
 * Created by Administrator on 2017/7/6.
 */
public class MysqlUser extends DBConnection implements IUser {

    public MysqlUser(){
        super(Constant.MYSQL);//连接mysql数据库
    }

    @Override
    public boolean insert(User user) {
        return true;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public boolean change(User user) {
        return false;
    }

    @Override
    public User get(int id) {
        return null;
    }
}

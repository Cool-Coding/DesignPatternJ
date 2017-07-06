package cn.yang.factory;

import cn.yang.db.IDepartment;
import cn.yang.db.IUser;
import cn.yang.db.MysqlDepartment;
import cn.yang.db.MysqlUser;

/**
 * Created by Administrator on 2017/7/6.
 */
public class MysqlFactory implements IAbstractFactory {
    @Override
    public IUser createDBUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDBDepartment() {
        return new MysqlDepartment();
    }
}

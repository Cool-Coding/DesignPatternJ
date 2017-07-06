package cn.yang.factory;

import cn.yang.db.IDepartment;
import cn.yang.db.IUser;
import cn.yang.db.OracleDepartment;
import cn.yang.db.OracleUser;

/**
 * Created by Administrator on 2017/7/6.
 */
public class OracleFactory implements IAbstractFactory {
    @Override
    public IUser createDBUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDBDepartment() {
        return new OracleDepartment();
    }
}

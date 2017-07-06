package cn.yang.db;

import cn.yang.bean.Department;
import cn.yang.constant.Constant;

/**
 * Created by Administrator on 2017/7/6.
 */
public class MysqlDepartment extends DBConnection implements IDepartment {

    public MysqlDepartment(){
        super(Constant.MYSQL);//连接mysql数据库
    }

    @Override
    public boolean insert(Department department) {
        return false;
    }

    @Override
    public boolean delete(Department department) {
        return false;
    }

    @Override
    public boolean change(Department department) {
        return false;
    }

    @Override
    public Department get(int id) {
        return null;
    }
}

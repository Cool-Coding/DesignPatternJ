package cn.yang.db;

import cn.yang.bean.Department;
import cn.yang.constant.Constant;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 * Created by Administrator on 2017/7/6.
 */
public class OracleDepartment extends DBConnection  implements IDepartment {

    public OracleDepartment(){
        super(Constant.ORACLE);//连接Oracle数据库
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

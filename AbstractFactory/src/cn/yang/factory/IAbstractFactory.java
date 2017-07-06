package cn.yang.factory;

import cn.yang.db.IDepartment;
import cn.yang.db.IUser;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by Administrator on 2017/7/6.
 */
public interface IAbstractFactory {
    IUser createDBUser();
    IDepartment createDBDepartment();
}

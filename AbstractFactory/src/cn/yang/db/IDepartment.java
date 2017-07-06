package cn.yang.db;

import cn.yang.bean.Department;

/**
 * Created by Administrator on 2017/7/6.
 */
public interface IDepartment {
    public boolean insert(Department department);
    public boolean delete(Department department);
    public boolean change(Department department);
    public Department get(int id);
}

package cn.yang.db;

import cn.yang.bean.User;

/**
 * Created by Administrator on 2017/7/6.
 */
public interface IUser {
    public boolean insert(User user);
    public boolean delete(User user);
    public boolean change(User user);
    public User    get(int id);
}

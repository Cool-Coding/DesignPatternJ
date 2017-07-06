package cn.yang.bean;

/**
 * Created by Administrator on 2017/7/6.
 */
import cn.yang.tools.*;

public class User {
    private int id;//身份证号
    private String name;//姓名
    private int age;//年龄
    private Sex sex;//性别
    private Department department;//所属部门

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

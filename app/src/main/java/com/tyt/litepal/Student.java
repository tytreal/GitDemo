package com.tyt.litepal;

/**
 * Created by Administrator on 2017-11-01.
 */

public class Student {
    private int id;//可写可不写，自动有
    private String name;
    private String no;
    private String sex;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

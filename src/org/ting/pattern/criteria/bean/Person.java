package org.ting.pattern.criteria.bean;

/**
 * 人类
 *
 * @author 张韧炼
 * @create 2019-07-04 下午4:42
 **/
public class Person {
    private String name, gender, maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}

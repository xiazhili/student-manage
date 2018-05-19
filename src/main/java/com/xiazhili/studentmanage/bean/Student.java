package com.xiazhili.studentmanage.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "xzl_student")
public class gitStudent {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column
    private String name;

    @Column
    private String gender;

    @Column
    private int age;

    @Column
    private String city;

    @Column
    private String desc;

    @Column
    private String[] interest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", desc='" + desc + '\'' +
                ", interest=" + Arrays.toString(interest) +
                '}';
    }
}

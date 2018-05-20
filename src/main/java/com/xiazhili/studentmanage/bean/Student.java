package com.xiazhili.studentmanage.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;

@Entity
@Table(name = "xzl_student")
public class Student {

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
    @Column
    private String grade;
    @Column
    private String classes;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stu_id")
    private Set<Score> score;

    @Column
    private final boolean modal = false;


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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClasses() {

        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Set<Score> getScore() {
        return score;
    }

    public void setScore(Set<Score> score) {
        this.score = score;
    }

    public boolean isModal() {
        return modal;
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
                ", grade='" + grade + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}

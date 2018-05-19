package com.xiazhili.studentmanage.service;

import com.xiazhili.studentmanage.bean.Student;

public interface StudentService {
    /**
     * 学生信息列表
     * @param page
     * @return
     */
    public Object list(Integer page);

    /**
     * 学生信息添加
     * @param student
     */
    public void insert(Student student);

    /**
     * 学生信息编辑
     * @param student
     */
    public void update(Student student);

    /**
     * 学生信息删除
     * @param id
     */
    public void delete(String id);


}

package com.xiazhili.studentmanage.service;

import com.xiazhili.studentmanage.bean.Student;
import org.springframework.data.domain.Pageable;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

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

    /**
     * 统计
     * @return
     */
    public Integer statistics();

    public Object listByClassesAndGrade(String classes, String grade,Integer page);


}

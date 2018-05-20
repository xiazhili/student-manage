package com.xiazhili.studentmanage.service.impl;

import com.xiazhili.studentmanage.bean.Student;
import com.xiazhili.studentmanage.dao.StudentRepository;
import com.xiazhili.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Page<Student> list(Integer page) {
        return studentRepository.findAll(new PageRequest(page - 1, 6));

    }

    @Override
    public void insert(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.saveAndFlush(student);
    }

    @Override
    public void delete(String id) {
        studentRepository.delete(id);
    }

    @Override
    public Integer statistics() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
//        studentList.stream().filter(student -> student.getGrade() ).mapToDouble()
        return null;
    }

    @Override
    public Object listByClassesAndGrade(String classes, String grade,Integer page) {
        return studentRepository.findByClassesAndGrade(classes,grade,new PageRequest(page - 1,6));
    }
}

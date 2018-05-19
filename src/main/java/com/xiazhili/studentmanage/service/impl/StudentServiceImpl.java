package com.xiazhili.studentmanage.service.impl;

import com.xiazhili.studentmanage.bean.Student;
import com.xiazhili.studentmanage.dao.StudentRepository;
import com.xiazhili.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Page<Student> list(Integer page) {
        return studentRepository.findAll(new PageRequest(-1,6));
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
}
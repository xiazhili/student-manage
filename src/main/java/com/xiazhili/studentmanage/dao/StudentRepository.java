package com.xiazhili.studentmanage.dao;

import com.xiazhili.studentmanage.bean.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student, String> ,JpaSpecificationExecutor<Student> {

    Page<Student> findByClassesAndGrade(String classes, String grade, Pageable pageable);

//    Page findByClassesAndGrade(String classes,String grade);

}

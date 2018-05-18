package com.xiazhili.studentmanage.dao;

import com.xiazhili.studentmanage.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {

}

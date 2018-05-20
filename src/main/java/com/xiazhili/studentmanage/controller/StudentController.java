package com.xiazhili.studentmanage.controller;

import com.xiazhili.studentmanage.bean.Student;
import com.xiazhili.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/list")
    public Object list(Integer page){
        return studentService.list(page);

    }

    @PostMapping("/insert")
    public Object insert(@RequestBody Student student){
        System.out.println(student);
        studentService.insert(student);
        return studentService.list(1);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Student student){
        studentService.update(student);
        return null;
    }

    @DeleteMapping("/delete")
    public Object delete(String id){
        System.out.println(id);
//        studentService.delete(id);
        return null;
    }
}

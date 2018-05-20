package com.xiazhili.studentmanage.controller;

import com.xiazhili.studentmanage.bean.Score;
import com.xiazhili.studentmanage.bean.Student;
import com.xiazhili.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/list")
    public Object list(Integer page){
        System.out.println(page);
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
//        System.out.println(student);
        if (student.getScore() != null) {
            double d = 0.0;
            d =  student.getScore().stream()
                    .filter(item -> item.getSubject().equals("语文"))
                    .collect(Collectors.averagingInt(item -> item.getScore()));
            student.getStats()[0] = (int) d;
            d = student.getScore().stream()
                    .filter(item -> item.getSubject().equals("数学"))
                    .collect(Collectors.averagingInt(item -> item.getScore()));
            student.getStats()[1] = (int) d;
            d = student.getScore().stream()
                    .filter(item -> item.getSubject().equals("英语"))
                    .collect(Collectors.averagingInt(item -> item.getScore()));
            student.getStats()[2] = (int) d;
            d = student.getScore().stream()
                    .filter(item -> item.getSubject().equals("物理"))
                    .collect(Collectors.averagingInt(item -> item.getScore()));
            student.getStats()[3] = (int) d;
            d = student.getScore().stream()
                    .filter(item -> item.getSubject().equals("化学"))
                    .collect(Collectors.averagingInt(item -> item.getScore()));
            student.getStats()[4] = (int) d;
        }
        System.out.println(student);
        studentService.update(student);
        return studentService.list(1);
    }

    @DeleteMapping("/delete")
    public Object delete(String id){
        System.out.println(id);
        studentService.delete(id);
        return studentService.list(1);
    }
}

package org.tipu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tipu.entity.Student;
import org.tipu.service.StudentService;

@Controller
@RequestMapping("/Student")
@ComponentScan(basePackages = {"org.tipu.service"})
public class StudentController {

//    @Autowired
//    StudentService studentService;
    @RequestMapping("/add")
    String add(Model model){
        model.addAttribute("student", new Student());
        return "add";
    }
    @RequestMapping("/save")
    String save(@ModelAttribute("student") Student student, Model model){

//        studentService.save(student);
        return "list";
    }
}

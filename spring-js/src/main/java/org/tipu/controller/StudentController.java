package org.tipu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Student")
public class StudentController {


    @RequestMapping("/add")
    String add(){
        System.out.println("Hit Add controller");
        return "add.html";
    }
    @RequestMapping("/save")
    String save(){
        System.out.println("Hit Add controller");
        return "list.html";
    }
}

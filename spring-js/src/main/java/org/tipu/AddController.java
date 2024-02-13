package org.tipu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

    @RequestMapping("/add")
    String add(){
       return "display.jsp";
    }
}

package org.tipu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {



    @RequestMapping("/index")
    String  index(){

        return "index.jsp";
    }

    @RequestMapping("/greet")
    public ModelAndView showView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");
        mv.addObject("result", "Wellcome to Spring MVC");
        return mv;
    }
}

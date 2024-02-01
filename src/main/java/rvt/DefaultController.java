package rvt;

// import java.util.ArrayList;
// import java.util.Date;
// import java.util.List;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
    // @GetMapping(value = "/")
    // ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name) {
    //     Student student = new Student("John", "Smith", "a@a.lv", "DP2-4");
    //     List<Student> students = new ArrayList<>();
    //     students.add(student);

    //     ModelAndView modelAndView = new ModelAndView("index");
    //     modelAndView.addObject("students", students);
    //     modelAndView.addObject("date", new Date().toString());
    //     return modelAndView;
    // }

    // @GetMapping(value = "/test")
    // public ModelAndView testAction() {
        
    //     ModelAndView modelAndView = new ModelAndView("test");
    //     Money mac1 = new Money(10, 50);
    //     Money mac2 = new Money(2, 80);
        
    //     Money mac3 = mac1.plus(mac2);

    //     modelAndView.addObject("result", mac3);

    //     return modelAndView;
    // }

    // int [] numbers = {2,7,6,4,21,35,2,7};

    // int startIndex = 4;
        
    @GetMapping(value = "/register")
    public ModelAndView newregister(){
        ModelAndView modelAndView = new ModelAndView("register");
        return modelAndView;
    }

    
}


package rvt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(value = "/test")
        ModelAndView testAction(){   
            
            ModelAndView ModelAndView = new ModelAndView("test");
            Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2.0);
            Book book2 = new Book("Robert Martin", "Clean Code", 1.0);
            Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

            CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
            CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
            CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);


            ModelAndView.addObject("rez", book1);

            return ModelAndView;
        }
        

    @GetMapping(value = "/")

        ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name) {
            Student student = new Student("John", "Smith", "a@a.lv", "DP2-4");
            List<Student> students = new ArrayList<>();
            students.add(student);
        

        ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("students", students);
            modelAndView.addObject("date", new Date().toString());
            return modelAndView;
        }

        @GetMapping(value = "/register")
        public ModelAndView test(@RequestParam HashMap<String, String> allParams, User user){

        if(allParams.containsKey("success")){
            ModelAndView modelAndView = new ModelAndView("success");
            return modelAndView;
        }
            ModelAndView modelAndView = new ModelAndView("register");
            return modelAndView;
        }


        @PostMapping(value = "/register")
        public String test1(@ModelAttribute("user") User user, BindingResult bindingResult){

            if (bindingResult.hasErrors()) {
            return "/register";
            }
            return "redirect:/register?success";
        }
}


    



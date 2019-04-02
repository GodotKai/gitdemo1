package com.newer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value="/{id:\\d{4}}",method= RequestMethod.GET)
    public ModelAndView test1(@PathVariable String id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("id",id);
        modelAndView.setViewName("test");
        return modelAndView;
    }
    @RequestMapping(value = "/test2",params = "username")
    public String test2(){
        System.out.println("test2被执行");
        return "test";
    }
    @RequestMapping(value = "/test3",params = "username!=admin")
    public String test3(){
        System.out.println("test3被执行");
        return "test";
    }
    /*@RequestMapping("/test3")
    public String test4(Student student){
        System.out.println(student.getStundent);
        student.getAddresses().forEach(address -> System.out.println(address.getCity()));
        return "test";
    }*/
}

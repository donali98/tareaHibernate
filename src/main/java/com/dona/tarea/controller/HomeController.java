package com.dona.tarea.controller;

import com.dona.tarea.domain.Product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("product", new Product());
        modelAndView.setViewName("index");
        return modelAndView;
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute Product product) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", product.getName());
        modelAndView.setViewName("result");
        return modelAndView;
    }
    
    

}
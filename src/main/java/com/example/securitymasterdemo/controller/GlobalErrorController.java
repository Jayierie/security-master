package com.example.securitymasterdemo.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalErrorController {
    @ExceptionHandler({Exception.class})
    public ModelAndView handleException(Exception ex) {
        System.out.println("========================================="+ex.getClass().getSimpleName());
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", ex.getMessage());
        mv.setViewName("error");
        return mv;
    }
}

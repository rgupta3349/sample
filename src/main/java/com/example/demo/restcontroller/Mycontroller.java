package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller 
{
   @RequestMapping("/hello")
    public String helloWorld() 
    {

      return "Hello World";
    }
}
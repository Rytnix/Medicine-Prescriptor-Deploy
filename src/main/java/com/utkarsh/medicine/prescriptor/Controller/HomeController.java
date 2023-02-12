package com.utkarsh.medicine.prescriptor.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/mp")
public class HomeController {


   @RequestMapping("/home")
    public String getHomepage( ){
//        System.out.println("Hello");
     return "index";
    }

    @RequestMapping("/cure")
    public String showCurePage(){
//       System.out.println("fever");
          return "cure";
    }



}

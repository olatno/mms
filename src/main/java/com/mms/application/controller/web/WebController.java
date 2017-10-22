package com.mms.application.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

   @GetMapping(value ="/")
   public String index() {
      return "index";
   }

   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
   }

   @RequestMapping(value = "/muslim/services", method = {RequestMethod.POST, RequestMethod.GET} )
   public String services(){

      return "/muslim/services";
   }

   @RequestMapping(value = "/muslim/register", method = {RequestMethod.POST, RequestMethod.GET} )
   public String register(){

      return "/muslim/register";
   }

   @RequestMapping(value = "/muslim/about_us", method = {RequestMethod.POST, RequestMethod.GET} )
   public String about_us(){

      return "/muslim/about_us";
   }

   @RequestMapping(value = "/muslim/contact_us", method = {RequestMethod.POST, RequestMethod.GET} )
   public String contact_us(){

      return "/muslim/contact_us";
   }

   @RequestMapping(value = "/muslim/projects", method = {RequestMethod.POST, RequestMethod.GET} )
   public String project(){

      return "/muslim/projects";
   }

   @RequestMapping(value = "/muslim/privacy", method = {RequestMethod.POST, RequestMethod.GET} )
   public String privacy(){

      return "/muslim/privacy";
   }

   @RequestMapping(value = "/muslim/support", method = {RequestMethod.POST, RequestMethod.GET} )
   public String support(){

      return "/muslim/support";
   }
}

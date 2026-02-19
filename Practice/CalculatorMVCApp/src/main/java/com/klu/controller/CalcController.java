package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
  @Autowired
  private CalcService service;
  @RequestMapping("/add")
  public int add(@RequestParam int a, @RequestParam int b ) {
    return service.add(a,b);
  }
  @RequestMapping("/subtract/{a}/{b}")
  public int subtract(@PathVariable int a, @PathVariable int b) {
    return service.substract(a, b);
  }
  @RequestMapping("/multplay/{a}/{b}")
  public int multplay(@PathVariable int a, @PathVariable int b) {
    return service.multiplication(a, b);
  }
  @RequestMapping("/divisior/{a}/{b}")
  public double divisior(@PathVariable int a, @PathVariable int b) {
    return service.divide(a, b);
  }
  @RequestMapping("/mode/{a}/{b}")
  public int mode(@PathVariable int a, @PathVariable int b) {
    return service.modulo(a, b);
  }

}
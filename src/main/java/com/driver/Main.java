package com.driver;

public class Main {
  RWOnly obj = new RWOnly();

//        obj.variable = "some value";
  //java: variable has private access in com.driver.RWOnly
  obj.setName("Updated");
  System.out.println(obj.getName());
  
}

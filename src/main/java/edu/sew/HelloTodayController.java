package edu.sew;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class HelloTodayController 
{
   @GetMapping("/") 
   public String getToday() {
     Date today = new Date();
     return "hello, today is "  + today;
   }	
    	
}

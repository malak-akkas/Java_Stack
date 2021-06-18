package com.malak.FirstProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class FirstProjectApplication {
        public static void main(String[] args) {
                SpringApplication.run(FirstProjectApplication.class, args);
        }
        
        // 1. Annotation
        @RequestMapping("/")
        // 3. Method that maps to the request route above
        public String hello() { // 3
                return "Hey, Have a wonderful day!";
        }

@RequestMapping("/random")

public String random() { // 3
        return "Hey again 🙈! Don't worry, everything gonna be okay. Relax and take a break. ";
}
}

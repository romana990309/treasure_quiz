package com.example.TreasureQuiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller 

public class HomeController {
    @GetMapping("/")
    @ResponseBody 
    public String home() {
        return "안녕하세요";
    }
    @GetMapping("/game")
    public String helloGame() {
        return "index";
    }
    
}

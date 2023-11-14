package com.webp3.webp3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import java.util.ArrayList;

@Controller
public class MyController {
    @GetMapping("/wise")
    public String wise(){
        return "wise";
    }
    @PostMapping("/wise/answer")
    public String wiseAnswer(String name, String t, Model mo){
        mo.addAttribute("name", name);
        mo.addAttribute("t", t);
        return "wiseAnswer";
    }
    @GetMapping("/ex03")
    public String ex03(){
        return "ex03";
    }
    @PostMapping("/ex03/answer")
    public String ex03Answer(String[] colorr, Model mo){
        mo.addAttribute("colorr", colorr);
        return "ex03Answer";
    }
    @GetMapping("/bread")
    public String bread(){
        return "bread";
    }
    @PostMapping("/bread/answer")
    public String breadAnswer(String bread, Integer price, String count,Model mo){
        mo.addAttribute("bread", bread);
        mo.addAttribute("price",price);
        mo.addAttribute("count", count);
        return "breadAnswer";
    }
    @GetMapping("/q06")
    public String q06(){
        return "q06";
    }
    @GetMapping("/q06/a")
    public String q06a(){
        return "q06a";
    }
    @GetMapping("/q06/b")
    public String q06b(){
        return "q06b";
    }
    @PostMapping("/q06/aa")
    public String q06aa(String first, String second, Model mo){
        mo.addAttribute("first", first);
        mo.addAttribute("second", second);
        return "q06aa";
    }
    @PostMapping("/q06/bb")
    public String q06bb(String job, Model mo){
        mo.addAttribute("job", job);
        return "q06bb";
    }
    @GetMapping("/iam")
    public String iam(){
        return "iam";
    }
    @PostMapping("/iam/answer")
    public String iamAnswer(String age, String gender, String[] food, String face, String grade, String brain, String comment, Model mo){
        mo.addAttribute("age", age);
        mo.addAttribute("gender",gender);
        mo.addAttribute("food",food);
        mo.addAttribute("face",face);
        mo.addAttribute("grade",grade);
        mo.addAttribute("brain", brain);
        mo.addAttribute("comment",comment);
        return "iamAnswer";
    }
}

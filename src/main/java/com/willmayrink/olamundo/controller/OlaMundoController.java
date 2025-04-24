package com.willmayrink.olamundo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {

    @GetMapping("/")
    public String olaMundo() {
        return htmlRender();
    }

    public String htmlRender() {
      return "redirect:/index.html";
    }
}

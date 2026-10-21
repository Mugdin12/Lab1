package com.example.lab1studenskiklub.controller;
import com.example.lab1studenskiklub.data.DemoData;
import com.example.lab1studenskiklub.model.event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class AppController {
    @GetMapping("/a")
    public String events(Model model){
        model.addAttribute("events",DemoData.events);
        return "ListA";
    }
    @GetMapping ("/b")
    public String members(Model model){
        model.addAttribute("members",DemoData.members);
        return "ListB";
    }

    @GetMapping ("/a/action/{id}")
    public String action (@PathVariable int id, Model model){
        Event event = DemoData.events.stream()
                .filter(e -> e.getId() == id)
                .fintFirst()
                .orElse(null);

        if(event == null){
            return "redirect:/a";
        }

        model.addAttribute("event", event);
        return "action";
    }

    @PostMapping ("/a/action/{id}")
    public String confirmAction(@PathVariable int id){
        return "redirect:/a";
    }
}

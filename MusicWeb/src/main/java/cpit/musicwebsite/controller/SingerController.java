package com.example.musicwebsite.controller;

import com.example.musicwebsite.model.Singer;
import com.example.musicwebsite.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class SingerController {

    private final SingerService singerService;

    @Autowired
    public SingerController(SingerService singerService) {
        this.singerService = singerService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("singers", singerService.getAllSingers());
        return "home";
    }

    @GetMapping("/singer/{id}")
    public String getSinger(@PathVariable Long id, Model model) {
        Optional<Singer> singer = singerService.getSingerById(id);
        if (singer.isPresent()) {
            model.addAttribute("singer", singer.get());
            return "singer";
        } else {
            return "redirect:/";
        }
    }
}

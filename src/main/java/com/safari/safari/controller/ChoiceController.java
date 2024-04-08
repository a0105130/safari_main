package com.safari.safari.controller;

import com.safari.safari.dao.ChoiceDAO;
import com.safari.safari.vo.ChoiceVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Choice")
public class ChoiceController {
    @GetMapping("/select")
    public String feedSelect(Model model) {
        return "thymeleafSafari/Choice";
    }

    @GetMapping("/choice1")
    public String choice1(Model model) {
        ChoiceDAO dao = new ChoiceDAO();
        List<ChoiceVO> chovo = dao.selectChoiceInfo();
        model.addAttribute ("InfoID", chovo);
        return "thymeleafSafari/Animal";
    }
    @GetMapping("/choice2")
    public String choice2(Model model) {
        ChoiceDAO dao = new ChoiceDAO();
        List<ChoiceVO> chovo = dao.selectChoiceInfo3();
        model.addAttribute ("InfoID", chovo);
        return "thymeleafSafari/Plants";
    }
    @GetMapping("/choice3")
    public String choice3(Model model) {
        ChoiceDAO dao = new ChoiceDAO();
        List<ChoiceVO> chovo = dao.selectChoiceInfo2();
        model.addAttribute ("InfoID", chovo);
        return "thymeleafSafari/Aquarium";
    }







}
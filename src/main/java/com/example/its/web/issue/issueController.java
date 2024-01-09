package com.example.its.web.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.its.domain.issue.issueService;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class issueController {

    private final issueService issueService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }

    @GetMapping("/createForm")
    public String showCreationForm() {
        return "issues/createForm";
    }
}
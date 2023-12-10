package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.Grade;


@Controller
public class GradeSubmissionController {

    @GetMapping("/grades")
    public String getMethodName(Model model) {
        Grade grade = new Grade("Ayush", "Hindi", 43);
        model.addAttribute("grades", grade);
        return "grades";
    }
    

}

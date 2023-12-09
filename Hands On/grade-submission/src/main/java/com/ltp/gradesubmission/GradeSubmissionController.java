package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GradeSubmissionController {

    @GetMapping("/grades")
    public String getMethodName() {
        System.out.println("Entered getMethodName method");
        System.out.println("Pushing for github commit");
        return "grades";
    }
    

}

package com.simulator.interview.controller;

import com.simulator.interview.model.UserData;
import com.simulator.interview.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/interview")
public class InterviewController {

    @Autowired
    private InterviewService interviewService;

    @PostMapping("/generate")
    public String generateQuestion(@RequestBody UserData userData) {
        return interviewService.generateQuestion(
                userData.getStack(),
                userData.getFrameworks(),
                userData.getLevel()
        );
    }
}

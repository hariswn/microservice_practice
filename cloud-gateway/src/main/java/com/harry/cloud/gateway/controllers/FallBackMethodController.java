package com.harry.cloud.gateway.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("limitServiceFallBack")
    public String limitServiceFallBackMethod() {
        return "Limit Service is taking longer than expected time. Please try again later!";
    }

    @GetMapping("studentTrainingServiceFallBack")
    public String studentTrainingServiceFallBackMethod() {
        return "Student Training Service is taking longer than expected time. Please try again later!";
    }


}

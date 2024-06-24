package com.harry.ms.controller;


import com.harry.ms.config.LimitConfiguration;
import com.harry.ms.model.LimitConfigModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitRestController {

    @Autowired
    private LimitConfiguration configuration;

    @GetMapping("/limits")
    public LimitConfigModel retriveLimitsFromConfigurations() {
        //getting values from the properties file
        return new LimitConfigModel(configuration.getMaximum(), configuration.getMinimum());
    }
}

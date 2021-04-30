package com.mavimdev.customJson.controller;

import com.mavimdev.customJson.dto.ExampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mavimdev.customJson.service.CustomJsonService;

@RestController()
public class CustomJsonController {

    private final CustomJsonService customJsonService;

    @Autowired
    public CustomJsonController(CustomJsonService customJsonService) {
        this.customJsonService = customJsonService;
    }

    @GetMapping(value="/data")
    public ExampleData getJsonData() {
        return customJsonService.getExampleData();
    }

}

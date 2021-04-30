package com.mavimdev.customJson.service;

import com.mavimdev.customJson.dto.ExampleData;
import org.springframework.stereotype.Service;

@Service
public class CustomJsonService {

    public ExampleData getExampleData() {
        return new ExampleData("example data 1", "example data 2");
    }
}

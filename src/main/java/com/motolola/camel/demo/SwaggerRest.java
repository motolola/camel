package com.motolola.camel.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerRest {

    @GetMapping("/swaggerlink")
    public String getSwag() {

        return "Hello World";
    }
}

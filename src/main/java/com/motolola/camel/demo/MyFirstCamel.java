package com.motolola.camel.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstCamel extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
                .transform().constant("I am here")
                .to("log:first-timer");
    }
}

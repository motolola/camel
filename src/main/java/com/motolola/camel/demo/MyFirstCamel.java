package com.motolola.camel.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstCamel extends RouteBuilder {

    public static final String I_AM_HERE = "I am here";

    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
                .transform().constant(I_AM_HERE)
                .to("log:first-timer");
    }
}

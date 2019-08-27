package com.keyholesoftware.lambda.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class GlobalProperties {
    @Value("${app.capturescopePath}")
    public String capturescopePath;
}

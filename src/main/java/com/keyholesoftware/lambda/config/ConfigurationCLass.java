package com.keyholesoftware.lambda.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
//@PropertySource("classpath:application.properties")
public class ConfigurationCLass {

    public String capturescopePath;
}
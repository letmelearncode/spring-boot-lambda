package com.example.lambda.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
   public int print(){

       log.info("Hello World");
       return 2;
   }
}

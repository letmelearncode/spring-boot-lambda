package com.example.lambda.rest;

import java.util.Arrays;
import java.util.List;

import com.example.lambda.config.GlobalProperties;
import com.example.lambda.config.ConfigurationCLass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.lambda.model.Language;

@RestController
public class LanguageResource {

    @Autowired
    private ConfigurationCLass lang;

    @Autowired
    private GlobalProperties gobar;


    //private  String capturescopePath;

    @RequestMapping(path = "/languages", method = RequestMethod.GET)
    public List<Language> listLambdaLanguages() {
        //Integer a = lang.print()+ lang.print();
        //a.toString();
        System.out.println("Hello");
        return Arrays.asList(new Language("node"), new Language("java"), new Language("python"+gobar.capturescopePath));
    }

}
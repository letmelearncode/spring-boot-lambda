package com.keyholesoftware.lambda.rest;

import java.util.Arrays;
import java.util.List;

import com.keyholesoftware.lambda.config.ConfigurationCLass;
import com.keyholesoftware.lambda.config.GlobalProperties;
import com.keyholesoftware.lambda.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.keyholesoftware.lambda.model.Language;

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
package org.qifeng.sbs;


import org.qifeng.sbs.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"org.qifeng.sbs.controller","org.qifeng.sbs"}) //org.qifeng.sbs => ThymeleafConfig / BeanConfig
public class App 
{	
    public static void main( String[] args ){
       SpringApplication.run(App.class, args);     
    }   
}

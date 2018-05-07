package com.yoga.services.config

import com.yoga.services.controller.HelloController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.view.InternalResourceViewResolver

@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(WebApplication.class,WebApplicationSecurity.class)
    }

    public static void main(String[] args) throws Exception {

        SpringApplication.run(WebApplication.class, args)
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver()
        resolver.setPrefix("/")
        resolver.setSuffix(".jsp")
        return resolver
    }

    @Bean
    HelloController helloController(){
        return new HelloController()
    }
}



package com.yoga.services.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

/**
 * Spring security for CSRF protection for form posts!!
 */
@EnableWebSecurity
class WebApplicationSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //csrf is enabled by default to disable uncomment below
        //http.csrf().disable()
    }
}

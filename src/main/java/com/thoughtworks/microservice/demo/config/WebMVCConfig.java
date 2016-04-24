package com.thoughtworks.microservice.demo.config;

import com.thoughtworks.microservice.demo.interceptors.AuthInterceptor;
import com.thoughtworks.microservice.demo.interceptors.FakeJigsawInterceptor;
import com.thoughtworks.microservice.demo.interceptors.JigsawInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Import({JigsawInterceptor.class, FakeJigsawInterceptor.class})
public class WebMVCConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor);
    }
}
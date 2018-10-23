package org.superbiz.struts;

import com.opensymphony.module.sitemesh.filter.PageFilter;
import org.apache.struts2.dispatcher.ActionContextCleanUp;
import org.apache.struts2.dispatcher.FilterDispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class Application {


    @Bean
    public FilterRegistrationBean filterDispatcher() {
        FilterDispatcher filterDispatcher = new FilterDispatcher();
        return new FilterRegistrationBean(filterDispatcher);
    }

    @Bean
    public FilterRegistrationBean cleanup() {
        ActionContextCleanUp actionContextCleanup = new ActionContextCleanUp();
        return new FilterRegistrationBean(actionContextCleanup);
    }

    @Bean
    public FilterRegistrationBean sitemesh() {
        PageFilter pageFilter = new PageFilter();
        return new FilterRegistrationBean(pageFilter);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


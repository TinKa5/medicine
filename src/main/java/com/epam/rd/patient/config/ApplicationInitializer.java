package com.epam.rd.patient.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        System.out.println("Inside application initializer...");

        AnnotationConfigWebApplicationContext cont=new AnnotationConfigWebApplicationContext();
        cont.register(SpringConfig.class);

        servletContext.addListener(new ContextLoaderListener(cont));

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(cont));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

/*
        servletContext.addFilter("springSecurityFilterChain", new DelegatingFilterProxy());
        servletContext.getFilterRegistration("springSecurityFilterChain")
                .addMappingForUrlPatterns(null, true, "/*");

                */
    }
}

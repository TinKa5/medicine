package com.epam.rd.patient.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value={"com.epam.rd.patient.repository","com.epam.rd.patient.service"})
@Import({MongoConfig.class,WebConfig.class})
public class SpringConfig {
}

package com.ufh.fedena.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.ufh.fedena")
//        excludeFilters=@ComponentScan.Filter(type= FilterType.REGEX, pattern={"edu.nu.cs.web.*"}))
@PropertySource(value = { "classpath:application.properties" })
public class Application {

}

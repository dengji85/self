package com.dengji85.self.blog.manager;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


@Configuration  
//@PropertySource("classpath:application.properties")  
@ImportResource({ "classpath:spring/dubbo-consumers-config.xml" }) 
public class DubboConfig {

}

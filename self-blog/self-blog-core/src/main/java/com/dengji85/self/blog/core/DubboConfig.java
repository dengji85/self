package com.dengji85.self.blog.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


@Configuration  
//@PropertySource("classpath:application-dev.properties")  
@ImportResource({ "classpath:spring/dubbo-provider-config.xml" }) 
public class DubboConfig {

}

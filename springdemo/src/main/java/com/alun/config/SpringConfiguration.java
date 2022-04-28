package com.alun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.alun")
@Import({DatabaseConfig.class, MyBatisPlusConfiguration.class})
public class SpringConfiguration {
}

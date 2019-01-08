package com.corey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.corey.service", "com.corey.dao"})
public class SpringConfig {
}
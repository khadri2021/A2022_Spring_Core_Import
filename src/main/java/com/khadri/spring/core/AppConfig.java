package com.khadri.spring.core;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({StudentConfig.class,CustomerConfig.class})
public class AppConfig {
}

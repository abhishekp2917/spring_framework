package org.example.annotations.context.componentScan.config;

import jakarta.annotation.;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.;

@Order
@Configuration
@ComponentScan("org.example.annotations.context.componentScan")
public class BeanConfig {
}

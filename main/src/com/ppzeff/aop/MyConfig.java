package com.ppzeff.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ppzeff.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}

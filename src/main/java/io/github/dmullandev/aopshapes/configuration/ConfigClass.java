package io.github.dmullandev.aopshapes.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({ "io.github.dmullandev.aopshapes.components", "io.github.dmullandev.aopshapes.aspects",
		"io.github.dmullandev.aopshapes.service" })
@EnableAspectJAutoProxy
public class ConfigClass {

}


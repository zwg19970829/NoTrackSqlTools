package com.example.notracksqltool.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mysql.no.track")
public class MysqlPropertiesConfiguration extends PropertiesConfiguration {
}

package com.example.notracksqltool.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mysql.no.track")
public class PropertiesConfiguration {

    private String prefix;

    private String subfix;

    private Boolean needRollBack;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSubfix() {
        return subfix;
    }

    public void setSubfix(String subfix) {
        this.subfix = subfix;
    }

    public Boolean getNeedRollBack() {
        return needRollBack;
    }

    public void setNeedRollBack(Boolean needRollBack) {
        this.needRollBack = needRollBack;
    }
}

package com.example.notracksqltool.configuration;

public class PropertiesConfiguration {

    private String template;

    private Boolean needRollBack;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Boolean getNeedRollBack() {
        return needRollBack;
    }

    public void setNeedRollBack(Boolean needRollBack) {
        this.needRollBack = needRollBack;
    }
}

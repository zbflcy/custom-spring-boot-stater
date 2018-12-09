package com.zbflcy.stater.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by curry on 18-12-9.
 */
@ConfigurationProperties(prefix = "zbflcy.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;


    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

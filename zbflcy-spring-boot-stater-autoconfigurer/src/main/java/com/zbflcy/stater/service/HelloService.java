package com.zbflcy.stater.service;

import com.zbflcy.stater.properties.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by curry on 18-12-9.
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayName(String name) {
        return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
    }

}

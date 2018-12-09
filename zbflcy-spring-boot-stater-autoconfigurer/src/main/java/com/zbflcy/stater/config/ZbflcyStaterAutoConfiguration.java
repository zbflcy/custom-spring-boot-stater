package com.zbflcy.stater.config;

import com.zbflcy.stater.properties.HelloProperties;
import com.zbflcy.stater.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by curry on 18-12-9.
 */
@Configuration
@EnableConfigurationProperties(value = HelloProperties.class)
@ConditionalOnWebApplication
public class ZbflcyStaterAutoConfiguration {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

}

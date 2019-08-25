package com.lpl.springboot.nb2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("form devopment profile");
    }

    @Bean
    @Profile("pro")
    public DemoBean proDemoBean() {
        return new DemoBean("from production profile");
    }
}

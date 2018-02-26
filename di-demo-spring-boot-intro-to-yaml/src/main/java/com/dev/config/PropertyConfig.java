package com.dev.config;

import com.dev.examplebeans.FakeDataSource;
import com.dev.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Jakez on 26/02/2018.
 */

@Configuration

// Spring 4
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties" })

// Spring 5
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})

public class PropertyConfig {

   // @Autowired
   // Environment env;

    @Value("${dev.username}")
    String user;
    @Value("${dev.password}")
    String password;
    @Value("${dev.dburl}")
    String url;

    @Value("${dev.jms.username}")
    String jmsUsername;
    @Value("${dev.jms.password}")
    String jmsPassword;
    @Value("${dev.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

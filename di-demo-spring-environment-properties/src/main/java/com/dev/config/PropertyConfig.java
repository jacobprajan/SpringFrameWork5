package com.dev.config;

import com.dev.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Jakez on 26/02/2018.
 */


// Added Environment Variables in Edit Configuration section



@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    // For accessing Operating system environment variables
    @Autowired
    Environment env;


    @Value("${dev.username}")
    String user;
    @Value("${dev.password}")
    String password;
    @Value("${dev.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
       // fakeDataSource.setUser(user);
        fakeDataSource.setUser(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

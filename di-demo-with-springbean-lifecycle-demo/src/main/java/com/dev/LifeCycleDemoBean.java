package com.dev;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Jakez on 24/02/2018.
 */

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware
{
    public LifeCycleDemoBean() {
        System.out.println("## I am in the LifeCycleDemoBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My bean name is : " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleDemoBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleDemoBean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set ");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## PostConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## PreDestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("## Before Init called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## After Init called by Bean Post Processor");
    }
}

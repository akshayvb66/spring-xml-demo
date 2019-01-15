package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor Actor;


    public Movie(com.stackroute.domain.Actor actor) {
        Actor = actor;
    }

    public Movie() {
    }

    public com.stackroute.domain.Actor getActor() {
        return Actor;
    }

    public void setActor(com.stackroute.domain.Actor actor) {
        Actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Actor=" + Actor +
                '}';
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      Actor actor= (Actor) applicationContext.getBean("actorA");
        System.out.println("from application context aware");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
       Actor actor=(Actor) beanFactory.getBean("actorB") ;
        System.out.println("from bean factory ");

    }

    public void setBeanName(String s) {
        System.out.println("Bean name is "+s);
    }
}
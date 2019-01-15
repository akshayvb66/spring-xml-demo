package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {
    public static void main(String[] args){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1= (Movie) context.getBean("movie1");
        System.out.println(movie1);

        ApplicationContext context4=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie4= (Movie) context4.getBean("movie");
        System.out.println(movie4);

        ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2= (Movie) context1.getBean("movie2");
        System.out.println(movie2);

        ApplicationContext context2=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3= (Movie) context2.getBean("movie3");
        System.out.println(movie3);

        System.out.println(movie1==movie2);


    }


}

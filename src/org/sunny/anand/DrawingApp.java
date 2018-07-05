package org.sunny.anand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        //Triangle tr = new Triangle();
        /**
         * XmlBeanFactory class is deprecated so it is advised to use other implementations of
         * BeanFactory interface like ClassPathXmlApplicationContext, FileSystemXmlApplicationContext
         * In case of ClassPath the resource should be available in the class path
         * In case of FileSystem the resource should be present in the file path
         */
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        //ApplicationContext ctxt =  new FileSystemXmlApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle tr = context.getBean(Triangle.class);
        tr.draw();
    }
}

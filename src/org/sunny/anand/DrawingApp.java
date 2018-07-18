package org.sunny.anand;

import org.springframework.context.support.AbstractApplicationContext;
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
        /**
         * Lifecycle Callbacks of Beans
         * registerShutdownHook method ensures that the spring application sutdowns when the application context exits
         * AbstratApplicationContext has the registerShutdownHook method which calls the destroy method
         *
         */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();// registers a shutdown hook when the main method finishes.
        Triangle tr = (Triangle) context.getBean("triangle1");// type cast object to type Triangle
        tr.draw();

        /**
         * Spring beans has 2 context singleton and prototype and it is defined as below
         * singleton - only one instance is created per Spring container(default). This happens when the context is
         *             intialized at runtime using the configuration, does not wait for getBean()
         * prototype - new bean/instance is created per request or reference, waits for getBean() , so getBean() creates
         *             the new beans.
         *webAware - Request scope --> when a new request is happening it will create a new bean for every new getBean()
         *         - Session scope --> when a new user for a new session it will create a new bean for every new session
         *         - Global session
         *
         *  While Initializing the beans the spring will call any Aware interfaces implemented by the class before
         *  initializing/creating the beans.
         */
        /**
         *
         * Bean post processor- used to perform common functionality across all the generated beans for the bean factory
         */


    }
}

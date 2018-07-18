package org.sunny.anand;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
    public ApplicationContext context;
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (Point point : points) {

            System.out.println("Point (" + point.getX() + " ," + point.getY() + " )");
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is: " + s);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Initializing the bean and then calling this method after the initialization is done.");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying the bean but calling the destroy method before.");
    }

    public void myInit() {
        System.out.println("My init method will be called.");
    }

    public void myCleanUp() {
        System.out.println("My clean up method will be called.");
    }
}

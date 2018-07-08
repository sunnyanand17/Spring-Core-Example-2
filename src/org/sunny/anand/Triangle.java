package org.sunny.anand;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {
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
}

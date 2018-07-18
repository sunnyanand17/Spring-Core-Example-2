package org.sunny.anand;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author sunnyanand
 * This is the bean post processor class which will be useful for performing
 * operations on all the beans which have been intialized
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("In Before initialization method. Bean name is " + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("In After initialization method. Bean name is " + s);
        return o;
    }
}

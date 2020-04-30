package ltd.beihu.spring.lifecycle.beanlifecycle;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

/**
 * @author Adam
 * @date 2020/4/30
 */
public class AnnotationBeanDefinitionParsingDemo {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // XmlBeanDefinitionReader
        // ConfigurationClassBeanDefinitionReader
        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(beanFactory);

        int before = beanFactory.getBeanDefinitionCount();
        annotatedBeanDefinitionReader.register(AnnotationBeanDefinitionParsingDemo.class);
        int after = beanFactory.getBeanDefinitionCount();


        // ResolvableType
        // BeanNameGenerator  AnnotationBeanNameGenerator
    }
}

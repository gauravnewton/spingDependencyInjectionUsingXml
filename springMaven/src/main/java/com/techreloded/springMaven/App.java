package com.techreloded.springMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        
    	Aliean obj = (Aliean) factory.getBean("aliean");
        obj.code();
        System.out.println(obj.age);
        System.out.println(obj.hashCode());
        
        
        Aliean obj1 = (Aliean) factory.getBean("aliean");
        obj1.code();
        System.out.println(obj1.age);
        System.out.println(obj1.hashCode());
    }
}

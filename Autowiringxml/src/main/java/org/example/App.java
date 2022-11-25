package org.example;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Emp emp1=(Emp) context.getBean("emp1");
        System.out.println(emp1);
        System.out.println( "Hello World!" );
    }
}

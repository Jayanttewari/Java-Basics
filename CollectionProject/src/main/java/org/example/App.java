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
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Student1 student=(Student1) context.getBean("student");
        System.out.println(student);

        Student1 student2=(Student1) context.getBean("student2");
        System.out.println(student2);
    }
}

package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //ClassPathXmlApplicationContext  context= new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);


    }
}

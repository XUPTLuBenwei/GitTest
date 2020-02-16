package xml_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.DocFlavor;

public class Test {
    @org.junit.Test
    public void test(){
        String xmlPath = "xml_constructor/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        CollData collData = (CollData) applicationContext.getBean("collDataId");
        System.out.println(collData);
    }
}

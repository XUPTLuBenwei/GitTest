package inject.factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    @org.junit.Test
    public void test() {
        //自定义实例工厂
        // 1.创建工厂
        MyBeanFactory myBeanFactory = new MyBeanFactory();
        //通过工厂实例，或的对象
        UserService userService = myBeanFactory.createService();
        userService.addUser();
    }
    @org.junit.Test
    public void test1(){
        String xmlPath = "inject/factory/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        inject.factory.UserService userService = (inject.factory.UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
    }
}


import di.BookService;
import ioc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //从spring容器获得
//        //获得容器
        String xmlPath = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //获得内容
        BookService bookService = (BookService) applicationContext.getBean("BookServiceId");
        bookService.addBook();




    }
}

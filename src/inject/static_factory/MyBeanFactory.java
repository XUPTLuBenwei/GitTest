package inject.static_factory;

public class MyBeanFactory {
    //创建实例
    public static UserService createService(){
        return new UserServiceImpl();
    }
}

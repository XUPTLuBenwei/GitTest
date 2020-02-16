package inject.factory;

public class MyBeanFactory {
    //创建实例
    public  UserService createService(){
        return new UserServiceImpl();
    }
}

package test.dtdl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//    3）创建代理对象
public class UserInvocationHandler implements InvocationHandler {
    private UserServiceImpl targetObject;//目标对象
//    private UserServiceImpl UserServiceImpl;

    public UserInvocationHandler(UserServiceImpl targetObject) {
        super();
        this.targetObject = targetObject;
    }
//   对目标对象进行代理
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);
    }
//    调用被代理的对象的方法都会执行此方法
    @Override
    public UserServiceImpl invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before.....");
        UserServiceImpl userService = (UserServiceImpl) method.invoke(proxy, args);
        System.out.println("after......");
        return userService;
    }
}

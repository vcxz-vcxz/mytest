package test.dtdl;

import org.junit.Test;

public class Test2 {
    @Test
    public void dtdl(){
        UserInvocationHandler invocationHandler = new UserInvocationHandler(new
                UserServiceImpl());
        UserService userService = (UserService) invocationHandler.getProxyInstance();
        userService.add("a");
    }
}

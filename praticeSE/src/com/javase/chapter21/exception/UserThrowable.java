package com.javase.chapter21.exception;

public class UserThrowable {
    public static void main(String[] args) {
        UserService userService=new UserService();
/*用户名不规范,应该在5-16位之间
com.javase.chapter21.exception.UserException: 用户名不规范,应该在5-16位之间
	at com.javase.chapter21.exception.UserService.register(UserService.java:8)
	at com.javase.chapter21.exception.UserThrowable.main(UserThrowable.java:8)

进程已结束,退出代码0
*/
        try{
            userService.register("小明","888");
        }
        catch (UserException u){
            System.out.println(u.getMessage());
            u.printStackTrace();
        }
    }
}

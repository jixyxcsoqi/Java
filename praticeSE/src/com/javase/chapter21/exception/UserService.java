package com.javase.chapter21.exception;

public class UserService{

    public void register(String username, String password)throws UserException{
        if(null==username||password.length()<5||password.length()>16){

           throw new UserException("用户名不规范,应该在5-16位之间");
        }System.out.println("登陆成功，欢迎"+username+"登录");
    }
}

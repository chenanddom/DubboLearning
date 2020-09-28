package com.itdom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = ctx.getBean(UserService.class);
        System.out.println(bean);
        String serious = bean.getInfo("serious");
        System.out.println(serious);
    }
}

package com.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext a=new ClassPathXmlApplicationContext("beans3.xml");
         Message m=a.getBean("message",Message.class);
         System.out.println(m.getMessageid()+" "+m.getMessage());
        ((AbstractApplicationContext) a).close();
	}

}

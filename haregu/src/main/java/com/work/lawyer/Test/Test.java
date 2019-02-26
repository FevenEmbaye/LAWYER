package com.work.lawyer.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.work.lawyer.Entity.User;
import com.work.lawyer.IRepository.IUserRepo;
import com.work.lawyer.Repository.UserRepoImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Dispatcher-servlet.xml");
//		IUserRepo userR = (IUserRepo) context.getBean(UserRepoImpl.class);
		IUserRepo userR = (IUserRepo) context.getBean("userRepoImpl");
	
		User user = new User();
		user.setFullName("Feven Embaye");
		user.setEmail("feveney16@gmail.com");
		user.setTelephone(456);
		user.setComment("I want to apply");
		userR.create(user);

	}

}

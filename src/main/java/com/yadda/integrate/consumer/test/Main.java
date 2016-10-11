package com.yadda.integrate.consumer.test;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yadda.integrate.api.IAppUserService;
import com.yadda.integrate.consumer.util.Environ;
import com.yadda.integrate.model.AppUser;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/config/applicationContext.xml");

		IAppUserService appUserService = Environ.getBean(IAppUserService.class);

		AppUser user = appUserService.getAppUserById(1);

		System.out.println(user.getFuserid());

		Assert.assertEquals(user.getFuserid().intValue(), 1);
	}
}

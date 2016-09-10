package com.addressbookdao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AddressBookDaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AddressBookDaoApplication.class, args);
	}
}

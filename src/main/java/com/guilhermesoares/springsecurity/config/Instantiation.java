package com.guilhermesoares.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.guilhermesoares.springsecurity.entities.User;
import com.guilhermesoares.springsecurity.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//A senha abaixo é a palavra "password" criptografada pelo BCrypt
		User u1 = new User(null, "username", "$2a$10$tGKD4d9gFZvplwwWeOdESuy4KzzGAgHc23QRgxHaGJrvHsjtnzN.C");
		userRepository.save(u1);
	}

}

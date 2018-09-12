package com.study.yaroslavambrozyak.costsmanager;

import com.study.yaroslavambrozyak.costsmanager.entity.User;
import com.study.yaroslavambrozyak.costsmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@SpringBootApplication
public class CostsManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CostsManagerApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	PasswordEncoder passwordEncoder =
			PasswordEncoderFactories.createDelegatingPasswordEncoder();

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		/*User user = new User();
		user.setName("user");
		user.setPassword(passwordEncoder.encode("12345"));
		System.out.println(passwordEncoder.encode("secret"));
		User save = userRepository.save(user);
		Optional<User> userByUserName = userRepository.findUserByUserName(save.getName());
		System.out.println(userByUserName.get().getName());*/
	}


}

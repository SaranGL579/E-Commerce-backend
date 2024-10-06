package com.sk.data;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.sk.model.User;
import com.sk.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
	
	private final UserRepository userRepo;
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub
		createUserIfNotExist();
	}

	private void createUserIfNotExist() {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			User u = new User();
			u.setFirstName("User"+i);
			u.setLastName("reddy");
			u.setEmail("reddy"+i+"@gmail.com");
			u.setPassword("1234");
			if(userRepo.existsByEmail(u.getEmail())) {
				continue;
			}
			userRepo.save(u);
		}
	}

}

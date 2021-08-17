package com.dov.securityapp;

import com.dov.securityapp.controller.LoginController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SecurityAppApplicationTests {

	@Autowired
	private LoginController controller;

	@Test
	void contextLoads()throws Exception {
		assertThat(controller).isNotNull();
	}

}

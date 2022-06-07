package com.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.demo.controller.PensionController;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class PensionmangementsystemApplicationTests {
	@Autowired
	
	PensionController con;
	
	@Test
	
	void contextLoads() {
		assertThat(con).isNotNull();
	}

}

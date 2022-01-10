package com;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSchemaApplicationTests {

	void Test(){
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.debug("===============cichuweilogger");
	}

	@Test
	void contextLoads() {
	}

}

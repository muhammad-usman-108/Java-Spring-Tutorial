package com.practice.spring.learnspringframework.enterprise;

import org.springframework.stereotype.Component;

@Component
public class MyWebController {
	public long returnValueFromBusinessService() {
		return 200;
	}
}

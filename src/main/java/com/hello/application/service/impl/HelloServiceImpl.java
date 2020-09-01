package com.hello.application.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hello.application.service.HelloService;

@Service(group = "hello-service", version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "hello from hello-service:" + name;
	}

}

package com.lemon.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //开启服务注册中心，供他们使用
public class CloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaServerApplication.class, args);
	}
}

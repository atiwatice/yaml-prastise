package com.appdeveloperblog.app.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class YamlProjectApplication implements CommandLineRunner {
	@Autowired
	private YAMLConfig myConfig;

	public static void main(String[] args) {
		SpringApplication.run(YamlProjectApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("using environment: " + myConfig.getEnvironment());
		System.out.println("name: " + myConfig.getName());
		System.out.println("enabled:" + myConfig.isEnabled());
		System.out.println("servers: " + myConfig.getServers());

	}

}

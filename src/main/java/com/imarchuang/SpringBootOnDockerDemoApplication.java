package com.imarchuang;

import com.imarchuang.model.Employee;
import com.imarchuang.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootOnDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOnDockerDemoApplication.class, args);
	}

	//for testing only
	//@Bean
//	public CommandLineRunner demo(EmployeeRepository repository) {
//		return (args) -> {
//
//			Employee employee = new Employee();
//			employee.setId("1");
//			employee.setFullName("Marc Huang");
//			employee.setEmail("huanghe622@gmail.com");
//			employee.setManagerEmail("wutong0222@gmail.com");
//
//			repository.save(employee);
//
//		};
//	}
}

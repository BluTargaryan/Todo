package com.todo.taskSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.todo.taskSystem.model")
public class TaskSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskSystemApplication.class, args);
	}

}

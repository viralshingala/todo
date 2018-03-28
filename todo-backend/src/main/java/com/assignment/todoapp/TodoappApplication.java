package com.assignment.todoapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.todoapp.models.Todo;
import com.assignment.todoapp.repositories.TodoRepository;

@SpringBootApplication(scanBasePackages={"com.assignment.todoapp"})
public class TodoappApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TodoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting -> {}", repository.save(new Todo("Check emails every morning...")));
	}
}

package com.brain.firstspringboot;

import com.brain.firstspringboot.component.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FirstSpringBootApplication {

	@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
	@Autowired
	private Person person;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);

	}
	@EventListener(ApplicationReadyEvent.class)		//оздаем метод и помечаем аннотацией по заданию
	void onRun(){
		person.goTaxi();
	}
}

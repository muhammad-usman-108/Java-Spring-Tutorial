package com.practice.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS", "usmanmuh"));
		repository.insert(new Course(2, "Learn Devops", "usmanmuh"));
		repository.insert(new Course(3, "Learn Vue.js", "usmanmuh"));
		repository.delete(1);
	}

}

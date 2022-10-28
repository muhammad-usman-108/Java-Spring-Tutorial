package com.practice.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.practice.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.practice.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS", "usmanmuh"));
		repository.save(new Course(2, "Learn Devops", "usmanmuh"));
		repository.save(new Course(3, "Learn Vue.js", "usmanmuh"));
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
	}

}

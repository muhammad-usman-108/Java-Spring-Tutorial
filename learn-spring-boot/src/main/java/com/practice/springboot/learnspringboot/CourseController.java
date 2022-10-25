package com.practice.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "Udemy"),
				new Course(2, "Learn DevOps", "Coursera")
				);
	}
}

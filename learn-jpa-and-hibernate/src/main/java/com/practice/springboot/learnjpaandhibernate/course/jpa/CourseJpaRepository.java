package com.practice.springboot.learnjpaandhibernate.course.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.springboot.learnjpaandhibernate.course.Course;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void insert (Course course) {
		entityManager.merge(course);
	}
	
	public Course find(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void delete(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}

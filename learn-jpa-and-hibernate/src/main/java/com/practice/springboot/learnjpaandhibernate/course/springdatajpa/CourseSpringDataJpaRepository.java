package com.practice.springboot.learnjpaandhibernate.course.springdatajpa;
import com.practice.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

}

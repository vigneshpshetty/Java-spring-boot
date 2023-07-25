package com.vignesh.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vignesh.springboot.learnjpaandhibernate.course.Course;
import com.vignesh.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.vignesh.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.vignesh.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn spring boot!", "vignesh"));
//		repository.insert(new Course(2, "Learn spring JDBC!", "vignesh"));
//		repository.insert(new Course(3, "Learn spring Hibernate and JPA!", "vignesh"));
		repository.save(new Course(1, "Learn Spring data JPA!", "vignesh"));
		repository.save(new Course(2, "Learn spring JDBC!", "vignesh"));
		repository.save(new Course(3, "Learn spring Hibernate and JPA!", "vignesh"));

		// delete
		repository.deleteById(2l);

		// select
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));

		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("vignesh"));
		System.out.println(repository.findByName("Learn Spring data JPA!"));
	}

}

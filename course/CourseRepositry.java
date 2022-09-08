 package com.example.JPA.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepositry extends CrudRepository<Course,String> {

	//Course findOne(String id);

}

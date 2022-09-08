package com.example.JPA.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepositry courseRepositry;
	
	private List<Course> courses= new ArrayList<>(Arrays.asList(
			 new Course("btech","341","4years"),
			 new Course("bed","342","2 years"),
			 new Course("bcom","343","20 years")
			 ));
	
	
	
	
	public   List<Course> getallcourses(){
		//return courses;
		return (List<Course>) courseRepositry.findAll();
	}
	public  Optional<Course>  getcourse(String id) {
		return courseRepositry.findById(id);
	}
	public void addCourse(Course course) {
		courseRepositry.save(course);
		
	}
	public void UpdateCourse(Course course, String id) {
		courseRepositry.save(course);
		
		
	}
	public void DeleteCourse(Course course, String id) {
		//courses.removeIf(t->t.getId().equals(id));
		courseRepositry.deleteById(id);
		
		
	}

}

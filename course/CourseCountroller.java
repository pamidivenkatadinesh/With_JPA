package com.example.JPA.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseCountroller {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getallcourses() {
		return courseService.getallcourses();
		
	}
	@RequestMapping("/courses/{id}")
	public Optional<Course> getcourse(@PathVariable String id) {
		return courseService.getcourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/courses/{id}")
	public void UpdateCourse(@RequestBody Course course,@PathVariable String id) {
		courseService.UpdateCourse(course,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/courses/{id}")
	public void DeleteCourse(@RequestBody Course course,@PathVariable String id) {
		courseService.DeleteCourse(course,id);
	}
	
	
	

}

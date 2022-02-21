package com.abc.springdemo3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.springdemo3.bean.Course;
import com.abc.springdemo3.bean.Greetings;
import com.abc.springdemo3.service.CourseService;

@Configuration
public class AppConfig {

	@Bean(name = "bean1")
	public Greetings getGreetingBean1() {
		Greetings greetings = new Greetings();
		greetings.setMsg("Hi spring..");
		return greetings;
	}

	@Bean(name = "bean2")
	public Greetings getGreetingBean2() {
		Greetings greetings = new Greetings();
		greetings.setMsg("Hi spring boot..");
		return greetings;
	}

	@Bean
	public Course getCouresBean() {
		Course course = new Course();
		Course course2 = new Course();
		course2.setCourseId(10);
		course.setCourseName("JavaFullstack");
		course.setDuration(60);
		return course;

	}

	@Bean
   public CourseService getCourseServiceBean() { 
	   CourseService courseService = new CourseService();
	   
	   return courseService;
   }
}


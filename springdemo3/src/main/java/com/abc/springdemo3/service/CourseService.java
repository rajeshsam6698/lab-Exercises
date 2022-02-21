package com.abc.springdemo3.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.springdemo3.bean.Course;

public class CourseService {

	@Autowired
	private Course course;

	public void setCourse(Course course) {
		this.course = course;
	}

	public void displayCourse() {
		System.out.println("Course Id: " + course.getCourseId());
		System.out.println("Course Nmae: " + course.getCourseName());
		System.out.println("Course Duration: " + course.getDuration());

	}
}

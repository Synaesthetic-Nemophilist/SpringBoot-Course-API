package org.nomaterials.springboottut.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nomaterials on 19/06/2017.
 */

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;  // injected repo by Spring


    public List<Course> getAllCourses(String id) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id)
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id);
    }


    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}

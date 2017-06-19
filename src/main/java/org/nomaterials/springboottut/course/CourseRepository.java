package org.nomaterials.springboottut.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nomaterials on 19/06/2017.
 */

public interface CourseRepository extends CrudRepository<Course, String> {

    //method name matters! Specific syntax (check docs)
    public List<Course> findByTopicId(String topicId);

}

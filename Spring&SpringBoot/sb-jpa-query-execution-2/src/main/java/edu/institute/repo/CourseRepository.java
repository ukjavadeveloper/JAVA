package edu.institute.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.institute.enitity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}

package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Student;
@Repository
public interface StudentRepository extends  JpaRepository<Student, Integer>{

}

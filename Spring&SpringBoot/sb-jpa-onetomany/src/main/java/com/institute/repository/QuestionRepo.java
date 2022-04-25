package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.Question;
@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}

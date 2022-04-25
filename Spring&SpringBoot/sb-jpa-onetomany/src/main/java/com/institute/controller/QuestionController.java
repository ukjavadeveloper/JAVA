package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.institute.repository.QuestionRepo;

@RestController
public class QuestionController {
	@Autowired
	QuestionRepo qrepo;
}

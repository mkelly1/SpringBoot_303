package com.example.demo;
//CRUD operations and pipeline to database

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>{}


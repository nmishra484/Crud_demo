package com.cruddemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cruddemo.entity.student;

public interface studentRepository extends CrudRepository<student, Long> {

}

package com.test.assn.spring4.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.assn.spring4.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long>  {

}

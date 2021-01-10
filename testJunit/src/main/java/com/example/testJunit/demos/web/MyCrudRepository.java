package com.example.testJunit.demos.web;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//only one
@Repository
public interface MyCrudRepository /* must no write else error */extends CrudRepository<User, Long>  {

}

package com.imarchuang.repository;

import com.imarchuang.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mhuang on 2016-11-21.
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}

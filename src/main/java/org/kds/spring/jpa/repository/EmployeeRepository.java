package org.kds.spring.jpa.repository;

import org.kds.spring.jpa.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employees, Long>, EmployeeRepositoryCustom {


}

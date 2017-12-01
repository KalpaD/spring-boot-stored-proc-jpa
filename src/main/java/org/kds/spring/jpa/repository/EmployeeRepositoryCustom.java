package org.kds.spring.jpa.repository;

import org.kds.spring.jpa.domain.Employees;

import java.util.List;

public interface EmployeeRepositoryCustom {

    List<Employees> getAllEmployees();
}

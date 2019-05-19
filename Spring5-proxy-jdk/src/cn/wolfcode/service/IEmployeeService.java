package cn.wolfcode.service;

import java.util.List;

import cn.wolfcode.domain.Employee;

public interface IEmployeeService {
	void save(Employee emp);

	void update(Employee emp);

	void delete(Long id);
	
	List<Employee> listAll();
}

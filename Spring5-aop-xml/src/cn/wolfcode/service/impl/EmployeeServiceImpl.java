package cn.wolfcode.service.impl;

import cn.wolfcode.dao.IEmployeeDAO;
import cn.wolfcode.domain.Employee;
import cn.wolfcode.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDAO dao;

	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}

	public void save(Employee emp) {
		dao.save(emp);
		System.out.println("保存成功");
	}

	public void update(Employee emp) {
		dao.update(emp);
		throw new RuntimeException("故意错误的");
	}
}

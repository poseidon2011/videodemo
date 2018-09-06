package com.agesun.mybatis.dao;
import java.util.List;



import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.agesun.mybatis.bean.Employee;
@Mapper
public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();


	//批量保存员工
	public Long addEmp(Employee employee);

	

}

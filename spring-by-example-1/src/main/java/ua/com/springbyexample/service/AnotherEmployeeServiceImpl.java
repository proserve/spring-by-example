package ua.com.springbyexample.service;

import java.util.Set;
import java.util.stream.Collectors;

import ua.com.springbyexample.domain.Employee;
import ua.com.springbyexample.domain.Position;
import ua.com.springbyexample.ds.EmployeeDS;


public class AnotherEmployeeServiceImpl implements  AnotherEmployeeService {
	
	private EmployeeDS employeeDS;	

	public void setEmployeeDS(EmployeeDS employeeDS) {
		this.employeeDS = employeeDS;
	}

	@Override
	public Set<Employee> getEmployeeListByPosition(Position position) {
        return employeeDS.getEmployees().stream()
                                        .filter(employee -> employee.getPosition() == position)
//                                        .map(employee -> employee)
                                        .collect(Collectors.toSet());
	}

}

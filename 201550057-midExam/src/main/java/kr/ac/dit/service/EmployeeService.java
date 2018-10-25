package kr.ac.dit.service;
import java.util.*;
import kr.ac.dit.domain.EmployeeVO;
public interface EmployeeService {
	public void createEmployee(EmployeeVO employeeVO) throws Exception;
	public List<EmployeeVO> readEmployeeList() throws Exception;
}

package kr.ac.dit.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.dit.domain.EmployeeVO;
import kr.ac.dit.persistence.EmployeeDAO;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	public void createEmployee(EmployeeVO employeeVO) throws Exception {
		employeeDAO.insertEmployee(employeeVO);
	}
	public List<EmployeeVO> readEmployeeList() throws Exception {
		return employeeDAO.selectEmployeeList();
	}
}

package kr.ac.dit.persistence;
import java.util.*;
import kr.ac.dit.domain.EmployeeVO;
public interface EmployeeDAO {
	public void insertEmployee(EmployeeVO employeeVO) throws Exception;
	public List<EmployeeVO> selectEmployeeList() throws Exception;
}

package kr.ac.dit.persistence;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.EmployeeVO;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertEmployee(EmployeeVO employeeVO) throws Exception {

	}
	@Override
	public List<EmployeeVO> selectEmployeeList() throws Exception {
		List<EmployeeVO> items = new ArrayList<EmployeeVO>();
		return items;
	}
}

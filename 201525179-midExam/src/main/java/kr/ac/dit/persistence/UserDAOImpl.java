package kr.ac.dit.persistence;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.UserVO;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertUser(UserVO userVO) throws Exception {

	}
	@Override
	public List<UserVO> selectUserList() throws Exception {
		List<UserVO> items = new ArrayList<UserVO>();
		return items;
	}
}

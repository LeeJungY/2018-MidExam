package kr.ac.dit.persistence;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.BookVO;
@Repository
public class BookDAOImpl implements BookDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertBook(BookVO bookVO) throws Exception {

	}
	@Override
	public List<BookVO> selectBookList() throws Exception {
		List<BookVO> items = new ArrayList<BookVO>();
		return items;
	}
}

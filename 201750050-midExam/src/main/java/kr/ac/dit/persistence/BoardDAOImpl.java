package kr.ac.dit.persistence;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.BoardVO;
@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {

	}
	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		List<BoardVO> items = new ArrayList<BoardVO>();
		return items;
	}
}

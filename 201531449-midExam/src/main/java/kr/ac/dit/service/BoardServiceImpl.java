package kr.ac.dit.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.dit.domain.BoardVO;
import kr.ac.dit.persistence.BoardDAO;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	public void createBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);
	}
	public List<BoardVO> readBoardList() throws Exception {
		return boardDAO.selectBoardList();
	}
}

package kr.ac.dit.service;
import java.util.*;
import kr.ac.dit.domain.BoardVO;
public interface BoardService {
	public void createBoard(BoardVO boardVO) throws Exception;
	public List<BoardVO> readBoardList() throws Exception;
}

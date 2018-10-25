package kr.ac.dit.persistence;
import java.util.*;
import kr.ac.dit.domain.BoardVO;
public interface BoardDAO {
	public void insertBoard(BoardVO boardVO) throws Exception;
	public List<BoardVO> selectBoardList() throws Exception;
}

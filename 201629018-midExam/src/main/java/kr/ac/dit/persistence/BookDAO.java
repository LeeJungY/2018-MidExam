package kr.ac.dit.persistence;
import java.util.*;
import kr.ac.dit.domain.BookVO;
public interface BookDAO {
	public void insertBook(BookVO bookVO) throws Exception;
	public List<BookVO> selectBookList() throws Exception;
}

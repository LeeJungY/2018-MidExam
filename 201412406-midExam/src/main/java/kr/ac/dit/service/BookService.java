package kr.ac.dit.service;
import java.util.*;
import kr.ac.dit.domain.BookVO;
public interface BookService {
	public void createBook(BookVO bookVO) throws Exception;
	public List<BookVO> readBookList() throws Exception;
}

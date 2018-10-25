package kr.ac.dit.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.dit.domain.BookVO;
import kr.ac.dit.persistence.BookDAO;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDAO;
	public void createBook(BookVO bookVO) throws Exception {
		bookDAO.insertBook(bookVO);
	}
	public List<BookVO> readBookList() throws Exception {
		return bookDAO.selectBookList();
	}
}

package Com.training.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.training.domains.BookManager;
import Com.training.entity.Book;

/**
 * Servlet implementation class BookServl
 */
public class BookServl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookManager mgr = new BookManager();
		HashMap<Long,Book> bookList = mgr.getAllBook();
		request.setAttribute("foundBooks", bookList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBook.jsp");
		
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long bookId = Long.parseLong(request.getParameter("bookId"));
		BookManager mgr = new BookManager();
		Book bk = mgr.findBookById(bookId);
		request.setAttribute("foundBook", bk);
		RequestDispatcher dispatcher = request.getRequestDispatcher("SearchResult.jsp");
		
		
		dispatcher.forward(request, response);
		
	}

}

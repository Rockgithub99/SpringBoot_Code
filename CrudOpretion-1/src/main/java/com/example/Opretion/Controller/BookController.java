package com.example.Opretion.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Opretion.Entity.Book;
import com.example.Opretion.Service.BookService;

@RestController
@RequestMapping("/newBook")
public class BookController {

	@Autowired
	BookService bookService;

	// get Book
	@GetMapping("/getBook")
	public List<Book> getAllBook() {

		List<Book> books = (List<Book>) bookService.getAllBook();
		System.out.println(books);
		return books;

	}

	// get book id
	@GetMapping("/getBookId/{bookid}")
	public Book getBook(@PathVariable int bookid) {
		Book bk = bookService.getBookById(bookid);
		return bk;
	}

	
	// create Book
	@PostMapping("/postBook")

	public int createBook(@RequestBody Book book) {
		bookService.savebook(book);
		int bb = book.getBookid();
		return bb;

	}
	
	// update Book
	@PutMapping("/putBook")
	public Book updateBook(@RequestBody Book book) {
		bookService.update(book,0);
		return book;
		
	}
	
	
	// delete Book
	
	@DeleteMapping("/deleteBook/{bookid}")
	public int deleteBook(@PathVariable int bookid) {
	bookService.delete(bookid);
		
	return bookid;
	}
	
	
	
	
	
	
	
	

}

package com.example.Opretion.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Opretion.Entity.Book;
import com.example.Opretion.Repo.BookRepo;

@Service
public class BookService {

	@Autowired
	BookRepo bookRepo;

	// get book list
	public List<Book> getAllBook() {

		List<Book> list = new ArrayList<Book>();
		bookRepo.findAll().forEach(book1 -> list.add(book1));

		return (List<Book>) list;

	}
	
	
	// get only one book
	
	public Book getBookById(int id) {
		return bookRepo.findById(id).get();
		
	}
	
	
	// create book
	
	
	public Book savebook(Book book) {
		Book bk=bookRepo.save(book);
		return bk;
		
	}
	
	
	// update Book
	
	public void update(Book book ,int bookid) {
		
		Book book1=bookRepo.save(book);
	
	}
	
	// delete Book
	
	public void delete(int bookid) {
		bookRepo.deleteById(bookid);
		
		
	}
	
	
	
	
	
	
	

	
}

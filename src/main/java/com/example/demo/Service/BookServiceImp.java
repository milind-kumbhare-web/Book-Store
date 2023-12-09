package com.example.demo.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repository.BookRepositoryI;

@Service
public class BookServiceImp implements BookService {

	
	private BookRepositoryI repository;

	public BookServiceImp(BookRepositoryI repository) {
		this.repository = repository;
	}

	public String upsertBook(Book book) {
		// TODO Auto-generated method stub
        Integer bookId=book.getBookId();
		Book save=repository.save(book);

		if (bookId == null) {
			return "Record Inserted";
		} else {
			return "Book Updated";
		}
	}

	public List<Book> getAllBook() {
		// TODO Auto-generated method stub

		return repository.findAll();
	}

	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		repository.deleteById(bookId);

		return "Book Deleted";
	}

}

package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Book;

public interface BookService {

	public String upsertBook(Book book);
	public List<Book> getAllBook();
	public String deleteBook(Integer bookid);
}

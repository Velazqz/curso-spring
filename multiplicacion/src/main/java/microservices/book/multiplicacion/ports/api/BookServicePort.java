package microservices.book.multiplicacion.ports.api;

import java.util.List;

import microservices.book.multiplicacion.data.BookDto;

public interface BookServicePort {

	BookDto addBook(BookDto bookDto);
	
	void deleteBookById(Long id);
	
	BookDto updateBook(BookDto bookDto);
	
	List<BookDto> getBookById(Long bookId);
	
}

package microservices.book.multiplicacion.ports.spi;

import java.util.List;

import microservices.book.multiplicacion.data.BookDto;

public interface BookPersistencePort {

	BookDto addBook(BookDto bookDto);
	
	void deleteBookById(Long id);
	
	BookDto updateBook(BookDto bookDto);
	
	List<BookDto> getBooks();
	
	BookDto getBookById(Long bookId);
	
}

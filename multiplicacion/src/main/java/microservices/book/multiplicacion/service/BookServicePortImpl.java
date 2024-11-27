package microservices.book.multiplicacion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import microservices.book.multiplicacion.data.BookDto;
import microservices.book.multiplicacion.ports.api.BookServicePort;
import microservices.book.multiplicacion.ports.spi.BookPersistencePort;


@Service
public class BookServicePortImpl implements BookServicePort{
	
	private BookPersistencePort bookPersistencePort;

	public BookServicePortImpl(BookPersistencePort bookPersistencePort) {
		this.bookPersistencePort = bookPersistencePort;
	}

	@Override
	public BookDto addBook(BookDto bookDto) {
		return bookPersistencePort.addBook(bookDto);
	}

	@Override
	public void deleteBookById(Long id) {	
		bookPersistencePort.deleteBookById(id);;
	}

	@Override
	public BookDto updateBook(BookDto bookDto) {
		return bookPersistencePort.updateBook(bookDto);
	}

	@Override
	public List<BookDto> getBooks() {
		return bookPersistencePort.getBooks();
	}

	@Override
	public BookDto getBookById(Long bookId) {
		return bookPersistencePort.getBookById(bookId);
	}
	

}

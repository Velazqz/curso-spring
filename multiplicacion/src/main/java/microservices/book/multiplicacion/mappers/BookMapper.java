package microservices.book.multiplicacion.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import microservices.book.multiplicacion.data.BookDto;
import microservices.book.multiplicacion.entity.Book;



@Mapper
public interface BookMapper {
  BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
  BookDto bookToBookDto(Book book);
  Book bookDtoToBook(BookDto bookDto);
  List<BookDto> bookListToBookDtoList(List<Book> bookList);
  List<Book> BookDtoListTobookList(List<BookDto> BookDtoList);
}
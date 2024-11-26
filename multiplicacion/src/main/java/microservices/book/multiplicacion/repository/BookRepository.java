package microservices.book.multiplicacion.repository;

import microservices.book.multiplicacion.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}

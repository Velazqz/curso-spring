package microservices.book.api.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import microservices.book.api.model.User;

//public interface UserRepository extends CrudRepository<User,UUID> {
public interface UserRepository
  extends PagingAndSortingRepository<User, UUID> {

	long count();
    Optional<User> findById(UUID id);
    User save(User user);
    Page<User> findAll(Pageable pagable);
    Optional<User> findByEmailIgnoreCase(String email);
}


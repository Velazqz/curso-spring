package microservices.book.api.service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import microservices.book.api.dto.UserResponse;
import microservices.book.api.dto.UserUpdateRequest;
import microservices.book.api.model.User;

public interface IUserService {
	ArrayList<UserResponse> findAll(int page,int size,String[] sort);
	Optional<User> getUser(UUID id);
	User putUser(UUID id,UserUpdateRequest userUpdate);
	long count();
}

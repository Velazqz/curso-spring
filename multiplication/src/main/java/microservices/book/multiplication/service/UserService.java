package microservices.book.multiplication.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import microservices.book.multiplication.dto.UserResponse;
import microservices.book.multiplication.dto.UserUpdateRequest;
import microservices.book.multiplication.exception.EmailAlreadyExistsException;
import microservices.book.multiplication.exception.NotFoundException;
import microservices.book.multiplication.model.User;
import microservices.book.multiplication.repository.UserRepository;

@Service
public class UserService implements IUserService {
	
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	

	@Override
	public ArrayList<UserResponse> findAll(int page, int size, String[] sort) {
		// Criterio de ordenamiento
	    List<Order> orders = new ArrayList<>();
		//sort[0] - atributo a ordenar
		//sort[1] - asc,desc
		if(sort[1].equals("desc")) {
			orders.add(new Order(Sort.Direction.DESC,sort[0]));
		} else {
			orders.add(new Order(Sort.Direction.ASC,sort[0]));
		}
				
				
		// Pageable
		PageRequest pageRequest = PageRequest.of(page, size,Sort.by(orders));
				
		// Query
		ArrayList<UserResponse> userResponse = new ArrayList<>();
				
		Iterable<User> users = userRepository.findAll(pageRequest);
				
		for(User u :users) {
			userResponse.add(new UserResponse(u.getId(),u.getCreationDate(),
					                          u.getEnabled(),u.getEmail(),
					                          u.getName(),u.getLastName(),
					                          u.getRole()));
		}
		
		return userResponse;
	}
	
	

	@Override
	public Optional<User> getUser(UUID id) {
		Optional<User> user = userRepository.findById(id);
		
		if(user.isPresent()) {
			return user;
		} else {
			throw new NotFoundException("NOT FOUND");
		}
	}
	

	@Override
	public User putUser(UUID id, UserUpdateRequest userUpdateRequest) {
		
        Optional<User> userOptional = userRepository.findById(id);
       User user = null;
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		
		if(userOptional.isPresent()) {
		    user = userOptional.get();
		    if(!(userRepository.findByEmailIgnoreCase(userUpdateRequest.getEmail()).isPresent())) {
		    	user.setEmail(userUpdateRequest.getEmail());
		    } else {
		    	throw new EmailAlreadyExistsException("Email already exists");
		    }
			
			user.setName(userUpdateRequest.getName());
			user.setLastName(userUpdateRequest.getLastName());
			
			if(userUpdateRequest.getVacationStart() != null) {
				user.setVacationStart(userUpdateRequest.getVacationStart());
			}
			
			if(userUpdateRequest.getVacationEnding() != null) {
				user.setVacationEnding(userUpdateRequest.getVacationEnding());
			}
			
			if(userUpdateRequest.getRole() != null) {
				user.setRole(userUpdateRequest.getRole());
			}
			
			user.setModificationDate(LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS));
		    user = userRepository.save(user);
			
		} else {
			throw new NotFoundException("NOT FOUND");
		}
		
		return user;
		
	}
	

	@Override
	public long count() {
		return userRepository.count();
	}
	
	

}

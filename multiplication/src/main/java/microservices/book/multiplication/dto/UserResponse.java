package microservices.book.multiplication.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class UserResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private UUID id;
	private LocalDateTime creationDate;
	private int enabled;
	private String email;
	private String name;
	private String lastName;
	private String role;
	
	public UserResponse(UUID id, LocalDateTime creationDate, 
			            int enabled, String email, String name, String lastName,
			            String role) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.enabled = enabled;
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.role = role;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}

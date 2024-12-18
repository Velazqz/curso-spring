package microservices.book.multiplication.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@GeneratedValue
	@Column(columnDefinition="RAW(16)")
	private UUID id;
	
	@Column(name="CREATION_DATE")
	private LocalDateTime creationDate;
	
	@Column(name="MODIFICATION_DATE")
	private LocalDateTime modificationDate;
	
	@Column(name="ENABLED")
	private int enabled;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="VACATION_START")
	private LocalDateTime vacationStart;
	
	@Column(name="VACATION_ENDING")
	private LocalDateTime vacationEnding;
	
	@Column(name="ROLE")
	private String role;
	
	
	public User() {}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LocalDateTime getVacationStart() {
		return vacationStart;
	}

	public void setVacationStart(LocalDateTime vacationStart) {
		this.vacationStart = vacationStart;
	}

	public LocalDateTime getVacationEnding() {
		return vacationEnding;
	}

	public void setVacationEnding(LocalDateTime vacationEnding) {
		this.vacationEnding = vacationEnding;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(LocalDateTime modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	

}

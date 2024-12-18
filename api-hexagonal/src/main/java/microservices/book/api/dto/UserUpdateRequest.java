package microservices.book.api.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserUpdateRequest {

	@NotNull
	@Email
	private String email;

	@NotBlank
	@NotNull
	private String name;

	@NotBlank
	@NotNull
	private String lastName;

	private LocalDateTime vacationStart;
	private LocalDateTime vacationEnding;

	@Pattern(regexp="^(DEVELOPER|ADMINISTRATOR)$")
	private String role;

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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

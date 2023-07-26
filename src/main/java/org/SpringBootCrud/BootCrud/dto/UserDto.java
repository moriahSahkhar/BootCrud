package org.SpringBootCrud.BootCrud.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Schema(description = "User DTO model information")
public class UserDto {
	private Long id;

	@Schema(description = "User First Name")
	@NotEmpty(message = "First Name should not be null or empty")
	private String fname;

	@Schema(description = "User Last Name")
	@NotEmpty(message = "Last Name should not be null or empty")
	private String lname;

	@Schema(description = "User Email")
	@NotEmpty(message = "Email should not be null or empty")
	@Email(message = "Email Address Should be valid")
	private String email;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(Long id, @NotEmpty(message = "First Name should not be null or empty") String fname,
			@NotEmpty(message = "Last Name should not be null or empty") String lname,
			@NotEmpty(message = "Email should not be null or empty") @Email(message = "Email Address Should be valid") String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}

}

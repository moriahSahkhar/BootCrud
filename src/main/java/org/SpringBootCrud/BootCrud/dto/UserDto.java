package org.SpringBootCrud.BootCrud.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;

    @NotEmpty(message = "First Name should not be null or empty")
    private String fname;

    @NotEmpty(message = "Last Name should not be null or empty")
    private String lname;

    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Email Address Should be valid")
    private String email;
}

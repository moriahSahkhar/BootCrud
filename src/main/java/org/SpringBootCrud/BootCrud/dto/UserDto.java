package org.SpringBootCrud.BootCrud.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "User DTO model information"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;

    @Schema(
            description = "User First Name"
    )
    @NotEmpty(message = "First Name should not be null or empty")
    private String fname;

    @Schema(
            description = "User Last Name"
    )
    @NotEmpty(message = "Last Name should not be null or empty")
    private String lname;

    @Schema(
            description = "User Email"
    )
    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Email Address Should be valid")
    private String email;
}

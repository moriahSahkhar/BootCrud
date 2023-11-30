package org.SpringBootCrud.BootCrud.controller;

import java.util.List;

import org.SpringBootCrud.BootCrud.dto.Esign;
import org.SpringBootCrud.BootCrud.dto.UserDto;
import org.SpringBootCrud.BootCrud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(
        name = "CRUD REST APIs for User Resource",
        description = "Create User, Update User, Get User, Get All Users, Delete User"
)
@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Operation(
            summary = "Create User Rest API",
            description = "Create User Rest API is used to save user in the database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP STATUS 201 CREATED"
    )
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody @Valid UserDto user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @Operation(
            summary = "Get User Rest API",
            description = "Get User Rest API is used to get a single user from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 SUCCESS"
    )
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @Operation(
            summary = "Get all User Rest API",
            description = "Get all User Rest API is used to get all users from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 SUCCESS"
    )
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @Operation(
            summary = "Put User Rest API",
            description = "Put User Rest API is used to update user in the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 SUCCESS"
    )
    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id, @RequestBody @Valid UserDto userDto) {
        userDto.setId(id);
        return new ResponseEntity<>(userService.updateUser(userDto), HttpStatus.OK);
    }

    @Operation(
            summary = "Delete User Rest API",
            description = "Delete User Rest API is used to delete user from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 SUCCESS"
    )
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable("id") Long id) {

        userService.deleteById(id);

        return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
    }



    @GetMapping("/msg8080")
    public String getMSG() {
        return "HELLO FROM 8080";
    }
}

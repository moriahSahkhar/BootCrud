package org.SpringBootCrud.BootCrud.controller;

import lombok.AllArgsConstructor;
import org.SpringBootCrud.BootCrud.Exception.ErrorDetails;
import org.SpringBootCrud.BootCrud.Exception.ResourceNotFoundException;
import org.SpringBootCrud.BootCrud.dto.UserDto;
import org.SpringBootCrud.BootCrud.model.User;
import org.SpringBootCrud.BootCrud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id,@RequestBody UserDto userDto){
        userDto.setId(id);
        return new ResponseEntity<>(userService.updateUser(userDto), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable("id") Long id){

        userService.deleteById(id);

        return new ResponseEntity<>("User Deleted Successfully", HttpStatus.OK);
    }
}

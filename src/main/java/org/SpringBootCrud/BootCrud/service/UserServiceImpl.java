package org.SpringBootCrud.BootCrud.service;

import lombok.AllArgsConstructor;
import org.SpringBootCrud.BootCrud.dto.UserDto;
import org.SpringBootCrud.BootCrud.mapper.UserMapper;
import org.SpringBootCrud.BootCrud.model.User;
import org.SpringBootCrud.BootCrud.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private UserRepo userRepo;

    public UserDto createUser(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepo.save(user);

        return UserMapper.mapToUserDto(savedUser);
    }

    public UserDto getUserById(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        User user = optionalUser.get();

        return UserMapper.mapToUserDto(user);
    }

    public List<UserDto> getAllUsers() {
        List<User> users = userRepo.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {
            UserDto userDto = UserMapper.mapToUserDto(user);
            userDtos.add(userDto);
        }

        return userDtos;
    }

    public UserDto updateUser(UserDto userDto) {
        Optional<User> optionalUser = userRepo.findById(userDto.getId());

        User existingUser = optionalUser.get();

        existingUser.setEmail(userDto.getEmail());
        existingUser.setFname(userDto.getFname());
        existingUser.setLname(userDto.getLname());

        User updatedUser = userRepo.save(existingUser);

        return UserMapper.mapToUserDto(updatedUser);
    }

    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}

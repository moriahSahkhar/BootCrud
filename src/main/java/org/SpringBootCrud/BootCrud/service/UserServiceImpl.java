package org.SpringBootCrud.BootCrud.service;

import lombok.AllArgsConstructor;
import org.SpringBootCrud.BootCrud.dto.UserDto;
import org.SpringBootCrud.BootCrud.mapper.UserMapper;
import org.SpringBootCrud.BootCrud.model.User;
import org.SpringBootCrud.BootCrud.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private UserRepo userRepo;
    private ModelMapper modelMapper;

    public UserDto createUser(UserDto userDto) {

//        User user = UserMapper.mapToUser(userDto);

        User user = modelMapper.map(userDto, User.class);
        User savedUser = userRepo.save(user);

        return modelMapper.map(savedUser, UserDto.class);
    }

    public UserDto getUserById(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        User user = optionalUser.get();

        return modelMapper.map(user, UserDto.class);
    }

    public List<UserDto> getAllUsers() {
//        List<User> users = userRepo.findAll();
//        List<UserDto> userDtos = new ArrayList<>();
//
//        for (User user : users) {
//            UserDto userDto = UserMapper.mapToUserDto(user);
//            userDtos.add(userDto);
//        }
//
//        return userDtos;

        List<User> users = userRepo.findAll();

//        return users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
        return users.stream().map((user) -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }

    public UserDto updateUser(UserDto userDto) {
        Optional<User> optionalUser = userRepo.findById(userDto.getId());

        User existingUser = optionalUser.get();

        existingUser.setEmail(userDto.getEmail());
        existingUser.setFname(userDto.getFname());
        existingUser.setLname(userDto.getLname());

        User updatedUser = userRepo.save(existingUser);

//        return UserMapper.mapToUserDto(updatedUser);
        return modelMapper.map(updatedUser, UserDto.class);
    }

    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}

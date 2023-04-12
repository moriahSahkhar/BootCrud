package org.SpringBootCrud.BootCrud.mapper;

import org.SpringBootCrud.BootCrud.dto.UserDto;
import org.SpringBootCrud.BootCrud.model.User;

public class UserMapper {

    //convert User to UserDTO
    public static UserDto mapToUserDto(User user){
        return new UserDto(user.getId(),user.getFname(),user.getLname(),user.getEmail());
    }

    //convert UserDTO to User
    public static User mapToUser(UserDto userDto){
        return new User(userDto.getId(),userDto.getFname(),userDto.getLname(),userDto.getEmail());
    }
}

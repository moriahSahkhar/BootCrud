package org.SpringBootCrud.BootCrud.mapper;

import org.SpringBootCrud.BootCrud.dto.UserDto;
import org.SpringBootCrud.BootCrud.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

//    @Mapping(source = "email", target = "emailAddress")
    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);
}

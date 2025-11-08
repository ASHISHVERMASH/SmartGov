package com.example.SmartGov.service;

import com.example.SmartGov.dto.UserDto;
import com.example.SmartGov.entity.User;
import com.example.SmartGov.exception.ResouceNotFoundException;
import com.example.SmartGov.mapper.UserMapper;
import com.example.SmartGov.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.toUserEntity(userDto);
        user = userRepository.save(user);
        return UserMapper.toUserDto(user);
    }

    public List<UserDto> getAllUser() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toUserDto)
                .toList();
    }
    public UserDto getUserById(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResouceNotFoundException("User not found with this id "));
        return UserMapper.toUserDto(user);
    }
}

package com.example.springboot.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.entity.dto.UserDTO;
import com.example.springboot.entity.User;

public interface UserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);
}

package ru.timur.web4_backend.dao;

import ru.timur.web4_backend.entity.UserEntity;

import java.util.Optional;

public interface UserDAO {
    void addUser(UserEntity user);
    Optional<UserEntity> getUserById(Long userId);
    Optional<UserEntity> getUserByUsername(String username);
}

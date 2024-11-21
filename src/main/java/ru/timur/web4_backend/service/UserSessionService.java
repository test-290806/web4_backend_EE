package ru.timur.web4_backend.service;

import ru.timur.web4_backend.entity.UserEntity;
import ru.timur.web4_backend.exception.SessionNotFoundException;
import ru.timur.web4_backend.exception.UserNotFoundException;

public interface UserSessionService {
    String startSession(UserEntity user);
    void endSession(String token) throws SessionNotFoundException;
    void updateLastActivity(String token) throws SessionNotFoundException;
    String getRefreshedTokenIfExpired(String token);
}

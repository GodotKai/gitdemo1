package com.newer.service;

import com.newer.domain.User;

/**
 * @author shining
 */
public interface UserService {

    User login(String username, String password);

    boolean register(User user);

    boolean checkName(String username);

    User findById(int userId);
}

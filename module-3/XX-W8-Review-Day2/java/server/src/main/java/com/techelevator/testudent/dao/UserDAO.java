package com.techelevator.testudent.dao;

import com.techelevator.testudent.model.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password);
}

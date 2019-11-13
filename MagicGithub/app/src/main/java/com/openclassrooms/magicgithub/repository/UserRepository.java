package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;


import java.util.Random;


public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser
    private Object User;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier

        return apiService.getUsers();

    }

    // TODO: A modifier

    public void generateRandomUser() {
        apiService.generateRandomUser();
    }


    public void deleteUser(User user) {
        // TODO: A modifier

        apiService.deleteUser(user);

    }


}


package com.company;

import impl.UserServiceImpl;
import model.Gender;
import model.User;
import service.UserService;

public class Main {
    static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        User user = new User(1, "Adilet", 17, Gender.MALE);
        User user2 = new User(2, "Maksat", 32, Gender.MALE);
        User user3 = new User(3, "Adila", 25, Gender.FEMALE);

        userService.addUsers(user);
        userService.addUsers(user3);
        userService.addUsers(user2);

        System.out.println("Find user by id 1!");
        userService.findByID(1);

        System.out.println("\nException is working!");
        userService.findByID(4);

        System.out.println("\nRemove users is working!");
        userService.findByID(2);
        userService.deleteById(2);

        System.out.println("\nGet all users:");
        System.out.println(userService.getAllUsers());
    }
}

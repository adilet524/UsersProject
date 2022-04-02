package service;

import model.User;

import java.util.List;

public interface UserService {
    void addUsers(User user);
    void findByID(int id);
    void deleteById(int id);
    List<User> getAllUsers();
}

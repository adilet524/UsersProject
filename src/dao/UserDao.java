package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    List<User> users = new ArrayList<>();

    public void addUserMethod(User user) {
        users.add(user);
    }

    public void findByIDMethod(int id) {
        users.stream().filter(user -> user.getId() == id).forEach(System.out::println);
    }

    public void deleteByIdMethod(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    public List<User> getAllUsers() {
        return users.stream().toList();
    }

    public boolean chekTrueOrFalseMethod(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().isEmpty();
    }
}

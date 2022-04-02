package impl;

import dao.UserDao;
import exception.UnknownException;
import model.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();


    @Override
    public void addUsers(User user) {
        userDao.addUserMethod(user);
    }

    @Override
    public void findByID(int id) {
        try {
            if(userDao.chekTrueOrFalseMethod(id)) {
                throw new UnknownException("Unknown id in Users!");
            }
            userDao.findByIDMethod(id);
        }catch (UnknownException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally is working!");
        }
    }

    @Override
    public void deleteById(int id) {
        userDao.deleteByIdMethod(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}

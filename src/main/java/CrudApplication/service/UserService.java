package CrudApplication.service;

import CrudApplication.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUser(long id);
}

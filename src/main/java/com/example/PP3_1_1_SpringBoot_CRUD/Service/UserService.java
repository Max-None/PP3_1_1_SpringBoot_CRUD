package com.example.PP3_1_1_SpringBoot_CRUD.Service;


import com.example.PP3_1_1_SpringBoot_CRUD.models.User;
import java.util.List;

public interface UserService {
    List<User> index();

    User getUserById(int id);

    void save(User user);

    void update(int id, User modifiedUser);

    void delete(int id);
}

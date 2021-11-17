package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list

    List<User> list = List.of(
      new User(1311L, "Sommay Ghosh", "9677193106"),
      new User(1312L, "Rama Kaushik", "6969696969"),
      new User(1313L, "Geetha Vimal", "8888888888"),
            new User(1314L, "Utkarsh Chauhan", "7777777777"),
            new User(1315L, "Arihant Kaushik brother of Rama Kaushik", "6666666666")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserID().equals(id)).findAny().orElse(null);
    }
}

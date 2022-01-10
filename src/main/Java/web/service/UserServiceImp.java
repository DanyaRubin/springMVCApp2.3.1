package web.service;

import web.models.User;

public class UserServiceImp implements UserService{



    @Override
    public void createUser(String name, int flat) {
        User user = new User (name,flat);

    }
}

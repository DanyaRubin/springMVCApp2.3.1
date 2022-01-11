package web.service;


import java.util.List;

public interface UserService {

     void createUser (String name, int flat);

     void updateUser(Long id, String name, int flat);

     void deleteUser(Long id);

     List getAllUser();
}

package usermanagement.user;

import java.util.List;

public interface UserService {
    User login(String username, String password) throws Exception;
    List<User> findAllUsers();
}

package usermanagement.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserRepository();

    @Override
    public User login(String username, String password) throws Exception {
        User user = userRepository.findUser(username, password);
        if(user == null){
            throw new Exception("User not found");
        }
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}

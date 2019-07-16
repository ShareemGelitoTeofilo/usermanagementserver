package usermanagement.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User login(String username, String password) throws Exception {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if(user == null){
            throw new Exception("User not found");
        }
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User signUpUser(User user) throws Exception {
        User existingUserWithSameUsername = userRepository.findByUsername(user.getUsername());
        if(existingUserWithSameUsername != null){
            throw new Exception("Username already exist");
        }
        return userRepository.save(user);
    }
}

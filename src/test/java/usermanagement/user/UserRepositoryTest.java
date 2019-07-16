package usermanagement.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class UserRepositoryTest extends DemoApplicationTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void saveUser(){
        User user = UserFactory.create(
                "Shareem", 21,
                "ademgelitoteofilo@yahoo.com",
                "Kalibo, Aklan",
                "123"
                );
        user.setFriends(null);
        assertNotNull(userRepository.save(user));
    }

    @Test
    public void findUserByUsernameAndPassword(){
        String username = "ademgelitoteofilo@yahoo.com";
        String password = "123";
        User user = userRepository.findByUsernameAndPassword(username, password);
        assertNotNull(user);
    }

    @Test
    public void findUserByName(){
        String username = "shareemgelitoteofilo@yahoo.com";
        User user = userRepository.findByUsername(username);
        assertNotNull(user);
    }
}

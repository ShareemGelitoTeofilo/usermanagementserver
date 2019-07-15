package usermanagement.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class UserRepositoryTest extends DemoApplicationTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findUser(){
        User user = userRepository.findUser("shareemgteofilo@yahoo.com", "123");
        assertNotNull(user);
    }


}

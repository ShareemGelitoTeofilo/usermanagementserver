package usermanagement.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class UserServiceTest extends DemoApplicationTest {

    @Autowired
    UserService userService;

    @Test
    public void signUpUser() throws Exception {
        User user = UserFactory.create(
                "Retrofit", 21,
                "retrofit@yahoo.com",
                "Mars",
                "123"
        );
        user.setFriends(null);
        user = userService.signUpUser(user);
        assertNotNull(user);
    }

}

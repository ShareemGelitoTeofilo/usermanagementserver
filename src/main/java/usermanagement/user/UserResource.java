package usermanagement.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    UserService userService = new UserServiceImpl();

    @GetMapping("/login")
    public User loginUser(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.login(username, password);
    }

    @GetMapping("/findAll")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

}

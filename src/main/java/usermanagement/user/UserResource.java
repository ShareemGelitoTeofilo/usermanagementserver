package usermanagement.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    UserService userService;


    @PostMapping("/signUp")
    public User signUpUser(@RequestBody User user) throws Exception {
        return userService.signUpUser(user);
    }

    @GetMapping("/login")
    public User loginUser(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.login(username, password);
    }

    @GetMapping("/findAll")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

}

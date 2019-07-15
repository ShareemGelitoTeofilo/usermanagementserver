package usermanagement;

import usermanagement.user.User;
import usermanagement.user.UserService;
import usermanagement.user.UserServiceImpl;

public class Test {
    static UserService userService = new UserServiceImpl();
    public static void main(String[] args) throws Exception {
        User user = userService.login("shareemgteofilo@yahoo.com", "123");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getAddress());
    }
}

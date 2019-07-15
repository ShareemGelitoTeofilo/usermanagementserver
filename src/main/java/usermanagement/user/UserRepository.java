package usermanagement.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> mockUsers;

    public UserRepository() {
        List<User> mockUsers = new ArrayList<>();
        mockUsers.add(UserFactory.create(
                "Shareem G. Teofilo",
                21,
                "shareemgteofilo@yahoo.com",
                "Kalibo, Aklan",
                "123"));

        mockUsers.add(UserFactory.create(
                "Adem G. Teofilo",
                21,
                "ademgteofilo@yahoo.com",
                "Banga, Aklan",
                "12345"));
        this.mockUsers = mockUsers;
    }

    public User findUser(String username, String password){
        for (User user: mockUsers) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public List<User> findAll(){
        return mockUsers;
    }

}

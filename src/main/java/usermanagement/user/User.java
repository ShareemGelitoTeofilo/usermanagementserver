package usermanagement.user;

import lombok.Getter;
import lombok.Setter;
import usermanagement.friend.Friend;
import java.util.List;

@Getter
@Setter
public class User {

    private String name;
    private int age;
    private String username;
    private String address;
    private String password;
    private List<Friend> friends;

    public User(String name, int age, String username, String address, String password, List<Friend> friends) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.address = address;
        this.password = password;
        this.friends = friends;
    }
}

package usermanagement.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import usermanagement.friend.Friend;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String username;
    private String address;
    private String password;

    public User() {
    }

    @OneToMany
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

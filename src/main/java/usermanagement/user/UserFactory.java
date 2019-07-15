package usermanagement.user;

import usermanagement.friend.Friend;
import usermanagement.friend.FriendFactory;
import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    public static User create(String name, int age, String username, String address, String password){
        return new User(name, age,  username, address, password, createFriends());
    }

    private static List<Friend> createFriends() {
        List<Friend> friends = new ArrayList<>();
        friends.add(FriendFactory.create("Joker", "jokerhahaha@yahoo.com", "Jaro, Iloilo City"));
        friends.add(FriendFactory.create("Batman", "batman@yahoo.com", "Jaro, Iloilo City"));
        friends.add(FriendFactory.create("Superman", "superman@yahoo.com", "Jaro, Iloilo City"));
        friends.add(FriendFactory.create("Barney", "barney@yahoo.com", "Jaro, Iloilo City"));
        friends.add(FriendFactory.create("Spiderman", "spiderman@yahoo.com", "Jaro, Iloilo City"));
        friends.add(FriendFactory.create("Lilo", "lilo@yahoo.com", "Jaro, Iloilo City"));
        friends.add(FriendFactory.create("Stitch", "stich@yahoo.com", "Jaro, Iloilo City"));
        return friends;
    }
}

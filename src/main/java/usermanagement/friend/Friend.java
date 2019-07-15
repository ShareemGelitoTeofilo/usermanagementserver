package usermanagement.friend;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Friend {
    private String name;
    private String email;
    private String address;

    public Friend(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}

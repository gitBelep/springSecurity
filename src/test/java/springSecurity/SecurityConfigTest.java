package springSecurity;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import static org.junit.jupiter.api.Assertions.*;

class SecurityConfigTest {

    @Test
    void creatingEncodedPasswords() {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        System.out.println(b.encode("user2"));
//        System.out.println(b.encode("user1"));
//        System.out.println(b.encode("user1"));
//        System.out.println(b.encode("user1"));
//        System.out.println(b.encode("user1"));
//
//        System.out.println(new BCryptPasswordEncoder().encode("user1"));
//        System.out.println(new BCryptPasswordEncoder().encode("user1"));
    }

}

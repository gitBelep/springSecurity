package springSecurity;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncoderTest {

    @Test
    void creatingEncodedPasswords() {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        System.out.println(b.encode("user1"));
        System.out.println(b.encode("user1"));
        System.out.println(b.encode("user1"));
        System.out.println(b.encode("user1"));
        System.out.println(b.encode("user1"));
    }

}

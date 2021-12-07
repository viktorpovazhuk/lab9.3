package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void builder() {
        User user = User.builder()
                .firstName("Vik")
                .age(19)
                .job("Ahahahhhsfhdfdssdf...........")
                .build();
        assertEquals("Ahahahhhsfhdfdssdf...........", user.getOccupations().get(0));
    }
}
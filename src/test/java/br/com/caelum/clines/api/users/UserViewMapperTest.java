package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserViewMapperTest {

    private final String NAME = "Fulano";
    private final String EMAIL = "fulano@gmail.com";
    private final String PASSWORD = "Fulano";

    private UserViewMapper mapper = new UserViewMapper();

    @Test
    void shouldConvertUserToUserView() {
        var user = new User(NAME, EMAIL, PASSWORD);
        mapper = new UserViewMapper();
        var userView = mapper.map(user);

        assertEquals(NAME, user.getName());
        assertEquals(EMAIL, user.getEmail());
    }

}

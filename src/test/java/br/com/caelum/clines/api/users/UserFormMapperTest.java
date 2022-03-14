package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserFormMapperTest {

    private static final String NAME = "Fulano";
    private static final String EMAIL = "Fulano@gmail.com";
    private static final String PASSWORD = "Fulano";

    private UserFormMapper mapper = new UserFormMapper();

    @Test
    void shouldConvertUserFormToUser() {
        var form = new UserForm(NAME, EMAIL, PASSWORD);
        form.setName(NAME);
        form.setEmail(EMAIL);
        form.setPassword(PASSWORD);

        var user = mapper.map(form);

        assertNotEquals(user, new User());
        assertEquals(NAME, user.getName());
        assertEquals(EMAIL, user.getEmail());
        assertEquals(PASSWORD, user.getPassword());
    }


}

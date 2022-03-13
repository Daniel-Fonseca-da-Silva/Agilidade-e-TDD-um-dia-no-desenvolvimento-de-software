package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.springframework.data.repository.Repository;

import java.util.Collection;

public interface UserRepository extends Repository<User, Long> {

    Collection<User> findAll();
}

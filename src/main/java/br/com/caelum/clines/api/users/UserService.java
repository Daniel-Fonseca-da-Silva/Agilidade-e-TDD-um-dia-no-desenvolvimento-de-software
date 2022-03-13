package br.com.caelum.clines.api.users;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserViewMapper viewMapper;

    public List<UserView> findAll() {
        return repository.findAll().stream().map(viewMapper::map).collect(toList());
    }
}

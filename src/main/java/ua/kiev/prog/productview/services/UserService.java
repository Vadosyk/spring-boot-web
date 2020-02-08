package ua.kiev.prog.productview.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.kiev.prog.productview.controllers.dto.UserRegistrationDto;
import ua.kiev.prog.productview.models.User;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}

package fr.simplon.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import fr.simplon.spring_security.repository.UserRepository;

public class UserServiceService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        fr.simplon.spring_security.model.User user = userRepository.findByUsername(username);
        return User.builder().username(user.getUsername()).password(user.getPassword()).roles(user.getRole()).build();
    }
}

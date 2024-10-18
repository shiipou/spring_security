package fr.simplon.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.simplon.spring_security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

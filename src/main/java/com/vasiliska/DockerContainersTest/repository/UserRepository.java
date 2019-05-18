package com.vasiliska.DockerContainersTest.repository;

import com.vasiliska.DockerContainersTest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

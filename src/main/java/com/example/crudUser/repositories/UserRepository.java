package com.example.crudUser.repositories;

import com.example.crudUser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

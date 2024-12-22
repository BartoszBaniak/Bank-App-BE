package com.bankapp.bankapplication.repository;

import com.bankapp.bankapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

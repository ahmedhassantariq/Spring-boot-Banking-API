package com.bank.bankingapp.repository;

import com.bank.bankingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail (String email);
    Boolean existsByAccountNumber (String accountNumber);
    User findByAccountNumber (String accountNumber);

}

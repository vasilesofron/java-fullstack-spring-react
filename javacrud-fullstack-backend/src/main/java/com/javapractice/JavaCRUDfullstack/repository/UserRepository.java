package com.javapractice.JavaCRUDfullstack.repository;

import com.javapractice.JavaCRUDfullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Using JpaRepository, so we can have access at all the methods available in it.
public interface UserRepository extends JpaRepository <User, Long>{


}

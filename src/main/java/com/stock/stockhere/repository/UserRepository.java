package com.stock.stockhere.repository;

import com.stock.stockhere.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findAllById(String id);

}

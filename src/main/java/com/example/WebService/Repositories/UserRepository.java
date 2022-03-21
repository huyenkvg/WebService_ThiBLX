package com.example.WebService.Repositories;

import com.example.WebService.Entity_BangLaiXe.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
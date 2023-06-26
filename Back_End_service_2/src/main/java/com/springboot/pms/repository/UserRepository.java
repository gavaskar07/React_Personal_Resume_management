package com.springboot.pms.repository;
import com.springboot.pms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
}
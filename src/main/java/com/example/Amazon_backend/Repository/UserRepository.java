package com.example.Amazon_backend.Repository;

import com.example.Amazon_backend.Entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Page<UserEntity> findUserEntityByUsernameStartsWith(String value, Pageable page);
    UserEntity findUserEntityByUsername(String name);
}

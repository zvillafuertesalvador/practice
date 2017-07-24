package com.iberotec.practice.domain.model.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iberotec.practice.domain.model.entities.User;

public interface UserJpaRepository extends JpaRepository<User, Long>{

}

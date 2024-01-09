package com.projetovcanepa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetovcanepa.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

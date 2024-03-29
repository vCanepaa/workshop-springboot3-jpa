package com.projetovcanepa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetovcanepa.curso.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

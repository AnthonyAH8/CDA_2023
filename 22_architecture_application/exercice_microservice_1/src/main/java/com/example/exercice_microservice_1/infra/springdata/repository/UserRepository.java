package com.example.exercice_microservice_1.infra.springdata.repository;

import com.example.exercice_microservice_1.domain.entity.User;
import com.example.exercice_microservice_1.infra.springdata.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}

package com.helpinghand.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.helpinghand.entity.UserEntity;


public interface UserRepo extends JpaRepository<UserEntity, Long>{

}

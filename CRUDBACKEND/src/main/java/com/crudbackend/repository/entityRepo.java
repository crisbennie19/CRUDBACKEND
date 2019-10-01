package com.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudbackend.model.dbEntity;

public interface entityRepo extends JpaRepository<dbEntity, Long> {

}

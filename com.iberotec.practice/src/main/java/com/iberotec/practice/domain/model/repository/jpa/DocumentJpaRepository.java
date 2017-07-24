package com.iberotec.practice.domain.model.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iberotec.practice.domain.model.entities.Document;

@Repository
public interface DocumentJpaRepository extends JpaRepository<Document, Long>{

}

package com.iberotec.practice.domain.model.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iberotec.practice.domain.model.entities.Module;

public interface ModuleJpaRepository extends JpaRepository<Module, Long>{

	List<Module> findByAcadProg(String acadProg);

}

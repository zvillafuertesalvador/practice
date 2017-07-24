package com.iberotec.practice.service.iface;

import java.util.List;

import com.iberotec.practice.domain.model.entities.Module;

public interface ModuleService {

	List<Module> findByAcadProg(String acadProg);

}

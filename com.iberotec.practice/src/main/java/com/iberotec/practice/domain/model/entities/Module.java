package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_MODULE")
@Getter
@Setter
@NamedNativeQueries({
	@NamedNativeQuery(
			name = "IPP_MODULE.findAll", query = "SELECT i FROM IPP_MODULE i"
	),
	@NamedNativeQuery(
			name = "IPP_MODULE.findByAcadProg", query = "SELECT i FROM IPP_MODULE i WHERE i.AcadProg = :AcadProg"
	)
})
public class Module implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IdModule")
	private Long idModule;
	
	@Column(name ="Name")
	private String name;
	
	@Column(name ="AcadProg")
	private String acadProg;
	
	@Column(name ="Hours")
	private int hours;
	
	@OneToMany(mappedBy = "internship")
	List<InternshipModule> internshipModule;
	
}

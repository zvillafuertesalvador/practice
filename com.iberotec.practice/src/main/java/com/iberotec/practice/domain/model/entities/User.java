package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_USER")
@Getter
@Setter
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IdUser")
	private Long idUser;
	
	@Column(name ="Emplid")
	private String emplid;
	
	@Column(name ="CampusId")
	private String campusId;
	
	@Column(name ="FullName")
	private String fullName;
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private List<Internship> internship;
	
	
}

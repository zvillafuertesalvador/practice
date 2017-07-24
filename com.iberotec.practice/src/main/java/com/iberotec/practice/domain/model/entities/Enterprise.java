package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_ENTERPRISE")
@Getter
@Setter
public class Enterprise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEnterprise")
	private Long idEnterprise;

	@Column(name = "Name")
	private String name;

	@Column(name = "Phone")
	private String phone;

	@Column(name = "Address")
	private String address;

	@Column(name = "StartDate")
	private Date startDate;

	@Column(name = "EndDate")
	private Date endDate;

	@OneToOne(mappedBy = "enterprise", fetch = FetchType.LAZY)
	private Internship internship;

}

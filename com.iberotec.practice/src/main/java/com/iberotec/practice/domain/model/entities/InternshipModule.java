package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_INTERNSHIP_MODULE")
@Getter
@Setter
public class InternshipModule implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdInternshipModule")
	private Long idInternshipModule;

	@Column(name = "Hours")
	private int hours;

	@Column(name = "Activity")
	private String activity;

	@Id
	@ManyToOne
	@JoinColumn(name = "IdModule")
	private Module module;

	@Id
	@ManyToOne
	@JoinColumn(name = "IdInternship")
	private Internship internship;
}

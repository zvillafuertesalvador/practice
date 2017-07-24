package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_MODALITY")
@Getter
@Setter
@NamedNativeQuery(name = "IPP_MODALITY.findAll", query = "SELECT i FROM IPP_MODALITY i")
public class Modality implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IdModality")
	private Long idModality;
	
	@Column(name ="Name")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="modality")
	private Internship internship;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "IPP_MODALITY_DOC", joinColumns = @JoinColumn(name = "IdModality"), inverseJoinColumns = @JoinColumn(name = "IdDocType"))	
	//@JsonBackReference
	private List<Document> document;
}

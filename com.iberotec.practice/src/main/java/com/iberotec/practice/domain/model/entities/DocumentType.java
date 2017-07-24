package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_DOC_TYPE")
@Getter
@Setter
public class DocumentType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "IdDocType")
	private Long idDocType;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "State")
	private boolean state;
	
	@OneToOne(cascade  = {CascadeType.ALL})
	@JoinColumn(name = "IdDocType")
	private Document document;
	
	
}

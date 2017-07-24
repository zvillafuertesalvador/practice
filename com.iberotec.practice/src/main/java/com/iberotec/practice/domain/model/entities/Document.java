package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_DOCUMENT")
@Getter
@Setter
public class Document implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IdDocument")
	private Long idDocument;
	
	@Column(name ="FilePath")
	private String filePath;
	
	@Column(name ="Filename")
	private String filename;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdInternship")
	private Internship internship;
	
	@OneToOne(mappedBy="document", fetch = FetchType.LAZY)
	private DocumentType documentType;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "document")
	private List<Modality> modality;
}

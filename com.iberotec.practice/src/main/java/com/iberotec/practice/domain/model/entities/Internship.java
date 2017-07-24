package com.iberotec.practice.domain.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IPP_INTERNSHIP")
@Getter
@Setter
public class Internship implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdInternship")
	private Long idInternship;

	@Column(name = "CreationDate")
	private Date creationDate;

	@Column(name = "UpdateDate")
	private Date updateDate;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "IdEnterprise")
	private Enterprise enterprise;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdUser")
	private User user;

	@OneToMany(mappedBy = "internship", cascade = CascadeType.ALL)
	private List<Document> document;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "IdModality")
	private Modality modality;

	@OneToMany(mappedBy = "module", cascade = CascadeType.ALL)
	List<InternshipModule> internshipModule;
}

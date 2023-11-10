package com.kanbantool.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Backlog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer PTSequence = 0;
	private String projectIndentifier;
	
	public Backlog() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPTSequence() {
		return PTSequence;
	}

	public void setPTSequence(Integer pTSequence) {
		PTSequence = pTSequence;
	}

	public String getProjectIndentifier() {
		return projectIndentifier;
	}

	public void setProjectIndentifier(String projectIndentifier) {
		this.projectIndentifier = projectIndentifier;
	}
	
	
}

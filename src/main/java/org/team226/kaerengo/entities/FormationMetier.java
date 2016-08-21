/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team226.kaerengo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "formation_metier")
public class FormationMetier implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "formationId", referencedColumnName = "id")
	private Formation formation;

	@ManyToOne
	@JoinColumn(name = "metierId", referencedColumnName = "id")
	private Metier metier;

	@Column
	private Integer compatibilite;

	public FormationMetier() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Metier getMetier() {
		return metier;
	}

	public void setMetier(Metier metier) {
		this.metier = metier;
	}

	public Integer getCompatibilite() {
		return compatibilite;
	}

	public void setCompatibilite(Integer compatibilite) {
		this.compatibilite = compatibilite;
	}

}

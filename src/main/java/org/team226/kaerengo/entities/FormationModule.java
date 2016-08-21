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

@Entity
public class FormationModule implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "formationId", referencedColumnName = "id")
	private Formation formation;

	@ManyToOne
	@JoinColumn(name = "moduleId", referencedColumnName = "id")
	private Module module;

	@Column
	private Long poids;

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Long getPoids() {
		return poids;
	}

	public void setPoids(Long poids) {
		this.poids = poids;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof FormationModule)) {
			return false;
		}
		FormationModule other = (FormationModule) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "kaerengo.entities.FormationModule[ id=" + id + " ]";
	}

}

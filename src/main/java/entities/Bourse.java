/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;

@Entity
public class Bourse implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String libelle;

	@Column
	private String donateur;

	@Column
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date debutDepot;

	@Column
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date finDepot;

	@Column(columnDefinition = "text")
	private String description;

	@ElementCollection(targetClass = Domaine.class)
	@CollectionTable(name = "domaine_bourse", joinColumns = @JoinColumn(name = "bourseId") )
	@Enumerated(EnumType.STRING)
	@Column(name = "domaine")
	private Set<Domaine> domainesCibles;

	@ElementCollection(targetClass = Niveau.class)
	@CollectionTable(name = "niveau_bourse", joinColumns = @JoinColumn(name = "bourseId") )
	@Enumerated(EnumType.STRING)
	@Column(name = "niveau")
	private Set<Niveau> niveauxCibles;

	public Bourse() {
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDonateur() {
		return donateur;
	}

	public void setDonateur(String donateur) {
		this.donateur = donateur;
	}

	public Date getDebutDepot() {
		return debutDepot;
	}

	public void setDebutDepot(Date debutDepot) {
		this.debutDepot = debutDepot;
	}

	public Date getFinDepot() {
		return finDepot;
	}

	public void setFinDepot(Date finDepot) {
		this.finDepot = finDepot;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Niveau> getNiveauxCibles() {
		return niveauxCibles;
	}

	public void setNiveauxCibles(Set<Niveau> niveauxCibles) {
		this.niveauxCibles = niveauxCibles;
	}

	public void addNiveau(Niveau niveau) {
		this.niveauxCibles.add(niveau);
	}

	public void removeNiveau(Niveau niveau) {
		this.niveauxCibles.remove(niveau);
	}

	public Set<Domaine> getDomainesCibles() {
		return domainesCibles;
	}

	public void setDomainesCibles(Set<Domaine> domainesCibles) {
		this.domainesCibles = domainesCibles;
	}

	public void addDomaine(Domaine domaine) {
		this.domainesCibles.add(domaine);
	}

	public void removeDomaine(Domaine domaine) {
		this.domainesCibles.remove(domaine);
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
		if (!(object instanceof Bourse)) {
			return false;
		}
		Bourse other = (Bourse) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "kaerengo.entities.Bourse[ id=" + id + " ]";
	}

}

/// *
// * To change this license header, choose License Headers in Project
/// Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
// package org.team226.kaerengo.entities;
//
// import java.io.Serializable;
// import java.util.Date;
// import java.util.Set;
//
// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.OneToMany;
// import javax.persistence.Temporal;
//
// @Entity
// public class Utilisateur implements Serializable {
//
// @OneToMany(mappedBy = "utilisateur")
//
// public static final String SEXE_MASCULIN = "Masculin";
// public static final String SEXE_FEMININ = "Féminin";
//
// private static final long serialVersionUID = 1L;
// @Id
// @GeneratedValue(strategy = GenerationType.AUTO)
// private Long id;
//
// @Column
// private String nom;
//
// @Column
// private String prenom;
//
// @Column
// @Temporal(javax.persistence.TemporalType.DATE)
// private Date dateNaissance;
//
// @Column
// private String sexe;
//
// @Column
// private String email;
//
// @Column
// private String motDePasse;
//
// @OneToMany
// private Set<UtilisateurFormation> formations;
//
// public Long getId() {
// return id;
// }
//
// public void setId(Long id) {
// this.id = id;
// }
//
// @Override
// public int hashCode() {
// int hash = 0;
// hash += (id != null ? id.hashCode() : 0);
// return hash;
// }
//
// public String getNom() {
// return nom;
// }
//
// public void setNom(String nom) {
// this.nom = nom;
// }
//
// public String getPrenom() {
// return prenom;
// }
//
// public void setPrenom(String prenom) {
// this.prenom = prenom;
// }
//
// public Date getDateNaissance() {
// return dateNaissance;
// }
//
// public void setDateNaissance(Date dateNaissance) {
// this.dateNaissance = dateNaissance;
// }
//
// public String getSexe() {
// return sexe;
// }
//
// public void setSexe(String sexe) {
// this.sexe = sexe;
// }
//
// public String getEmail() {
// return email;
// }
//
// public void setEmail(String email) {
// this.email = email;
// }
//
// public String getMotDePasse() {
// return motDePasse;
// }
//
// public void setMotDePasse(String motDePasse) {
// this.motDePasse = motDePasse;
// }
//
// public Set<UtilisateurFormation> getFormations() {
// return formations;
// }
//
// public void setFormations(Set<UtilisateurFormation> formations) {
// this.formations = formations;
// }
//
// @Override
// public boolean equals(Object object) {
// // TODO: Warning - this method won't work in the case the id fields are
// // not set
// if (!(object instanceof Utilisateur)) {
// return false;
// }
// Utilisateur other = (Utilisateur) object;
// if ((this.id == null && other.id != null) || (this.id != null &&
/// !this.id.equals(other.id))) {
// return false;
// }
// return true;
// }
//
// @Override
// public String toString() {
// return "kaerengo.entities.Utilisateur[ id=" + id + " ]";
// }
//
// }

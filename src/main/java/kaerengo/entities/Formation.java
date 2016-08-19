/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaerengo.entities;

import java.io.Serializable;
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
import javax.persistence.OneToMany;

/**
 *
 * @author knazanga
 */
@Entity
public class Formation implements Serializable {

    public static final Integer PARCOURS_ENSEIGNEMENT_GLE = 0;
    public static final Integer PARCOURS_ENSEIGNEMENT_TECHNIQUE = 1;
    public static final Integer PARCOURS_FONDAMENTALE = 2;
    public static final Integer PARCOURS_INGENIEUR = 3;
    public static final Integer PARCOURS_ADMINISTRATION = 4;
    public static final Integer PARCOURS_AUTRES = -1;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nom;

    @Column
    private String description;

    @Column
    private Integer parcours;

    @ElementCollection(targetClass = Aptitude.class)
    @CollectionTable(name="aptitude_formation",
            joinColumns = @JoinColumn(name = "formationId"))
    @Enumerated(EnumType.STRING)
    @Column(name="aptitude")
    private Set<Aptitude> aptitudes;

     @ElementCollection(targetClass = Niveau.class)
    @CollectionTable(name = "niveau_formation",
            joinColumns=@JoinColumn(name = "formationId") )
    @Enumerated(EnumType.STRING)
    @Column(name="niveau")
    private Set<Niveau> niveau;

    @ElementCollection(targetClass = Domaine.class)
    @CollectionTable(name="domaine_formation",
            joinColumns = @JoinColumn(name = "formationId"))
    @Enumerated(EnumType.STRING)
    @Column(name = "domaine")
    private Set<Domaine> domaines;

    @OneToMany(mappedBy = "formation")
    private Set<FormationMetier> metiers;

    @OneToMany(mappedBy = "formation")
    private Set<FormationModule> modules;

    @OneToMany(mappedBy = "formation")
    private Set<UtilisateurFormation> utilisateurs;

    public Formation(String nom, String description, Integer parcours) {
        this.nom = nom;
        this.description = description;
        this.parcours = parcours;
    }

    public Formation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getParcours() {
        return parcours;
    }

    public void setParcours(Integer parcours) {
        this.parcours = parcours;
    }

    public Set<Aptitude> getAptitudes() {
        return aptitudes;
    }

    public void setAptitudes(Set<Aptitude> aptitudes) {
        this.aptitudes = aptitudes;
    }
    
    public void addAptitude(Aptitude aptitude){
        this.aptitudes.add(aptitude);
    }
    
    public void removeAptitude(Aptitude aptitude){
        this.aptitudes.remove(aptitude);
    }

    public Set<Niveau> getNiveau() {
        return niveau;
    }

    public void setNiveau(Set<Niveau> niveau) {
        this.niveau = niveau;
    }

    public Set<Domaine> getDomaines() {
        return domaines;
    }
    
    public void addDomaine(Domaine domaine){
        this.domaines.add(domaine);
    }
    
    public void removeDomaine(Domaine domaine){
        this.domaines.remove(domaine);
    }

    public void setDomaines(Set<Domaine> domaines) {
        this.domaines = domaines;
    }

    public Set<FormationMetier> getMetiers() {
        return metiers;
    }
    
    public void setMetiers(Set<FormationMetier> metiers) {
        this.metiers = metiers;
    }

    public Set<FormationModule> getModules() {
        return modules;
    }

    public void setModules(Set<FormationModule> modules) {
        this.modules = modules;
    }

    public Set<UtilisateurFormation> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set<UtilisateurFormation> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kaerengo.entities.Formation[ id=" + id + " ]";
    }

}

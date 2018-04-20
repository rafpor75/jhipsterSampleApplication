package com.saf.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Cdl.
 */
@Entity
@Table(name = "cdl")
public class Cdl implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codice")
    private String codice;

    @Column(name = "nome")
    private String nome;

    @Column(name = "abilitato")
    private Boolean abilitato;

    @OneToMany(mappedBy = "relMatCdl")
    @JsonIgnore
    private Set<Materie> relCdlMats = new HashSet<>();

    @ManyToOne
    private Facolta facolta;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public Cdl codice(String codice) {
        this.codice = codice;
        return this;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public Cdl nome(String nome) {
        this.nome = nome;
        return this;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isAbilitato() {
        return abilitato;
    }

    public Cdl abilitato(Boolean abilitato) {
        this.abilitato = abilitato;
        return this;
    }

    public void setAbilitato(Boolean abilitato) {
        this.abilitato = abilitato;
    }

    public Set<Materie> getRelCdlMats() {
        return relCdlMats;
    }

    public Cdl relCdlMats(Set<Materie> materies) {
        this.relCdlMats = materies;
        return this;
    }

    public Cdl addRelCdlMat(Materie materie) {
        this.relCdlMats.add(materie);
        materie.setRelMatCdl(this);
        return this;
    }

    public Cdl removeRelCdlMat(Materie materie) {
        this.relCdlMats.remove(materie);
        materie.setRelMatCdl(null);
        return this;
    }

    public void setRelCdlMats(Set<Materie> materies) {
        this.relCdlMats = materies;
    }

    public Facolta getFacolta() {
        return facolta;
    }

    public Cdl facolta(Facolta facolta) {
        this.facolta = facolta;
        return this;
    }

    public void setFacolta(Facolta facolta) {
        this.facolta = facolta;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cdl cdl = (Cdl) o;
        if (cdl.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), cdl.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Cdl{" +
            "id=" + getId() +
            ", codice='" + getCodice() + "'" +
            ", nome='" + getNome() + "'" +
            ", abilitato='" + isAbilitato() + "'" +
            "}";
    }
}

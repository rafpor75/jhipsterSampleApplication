package com.saf.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Materie.
 */
@Entity
@Table(name = "materie")
public class Materie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cfu")
    private Integer cfu;

    @Column(name = "abilitato")
    private Boolean abilitato;

    @Column(name = "data_modifica")
    private LocalDate dataModifica;

    @ManyToOne
    private Cdl relMatCdl;

    @ManyToOne
    private Tutor relMatTut;

    @ManyToOne
    private Docenti relMatDoc;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Materie nome(String nome) {
        this.nome = nome;
        return this;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCfu() {
        return cfu;
    }

    public Materie cfu(Integer cfu) {
        this.cfu = cfu;
        return this;
    }

    public void setCfu(Integer cfu) {
        this.cfu = cfu;
    }

    public Boolean isAbilitato() {
        return abilitato;
    }

    public Materie abilitato(Boolean abilitato) {
        this.abilitato = abilitato;
        return this;
    }

    public void setAbilitato(Boolean abilitato) {
        this.abilitato = abilitato;
    }

    public LocalDate getDataModifica() {
        return dataModifica;
    }

    public Materie dataModifica(LocalDate dataModifica) {
        this.dataModifica = dataModifica;
        return this;
    }

    public void setDataModifica(LocalDate dataModifica) {
        this.dataModifica = dataModifica;
    }

    public Cdl getRelMatCdl() {
        return relMatCdl;
    }

    public Materie relMatCdl(Cdl cdl) {
        this.relMatCdl = cdl;
        return this;
    }

    public void setRelMatCdl(Cdl cdl) {
        this.relMatCdl = cdl;
    }

    public Tutor getRelMatTut() {
        return relMatTut;
    }

    public Materie relMatTut(Tutor tutor) {
        this.relMatTut = tutor;
        return this;
    }

    public void setRelMatTut(Tutor tutor) {
        this.relMatTut = tutor;
    }

    public Docenti getRelMatDoc() {
        return relMatDoc;
    }

    public Materie relMatDoc(Docenti docenti) {
        this.relMatDoc = docenti;
        return this;
    }

    public void setRelMatDoc(Docenti docenti) {
        this.relMatDoc = docenti;
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
        Materie materie = (Materie) o;
        if (materie.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), materie.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Materie{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", cfu=" + getCfu() +
            ", abilitato='" + isAbilitato() + "'" +
            ", dataModifica='" + getDataModifica() + "'" +
            "}";
    }
}

package com.saf.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Materie entity.
 */
public class MaterieDTO implements Serializable {

    private Long id;

    private String nome;

    private Integer cfu;

    private Boolean abilitato;

    private LocalDate dataModifica;

    private Long relMatCdlId;

    private String relMatCdlNome;

    private Long relMatTutId;

    private String relMatTutCognome;

    private Long relMatDocId;

    private String relMatDocCognome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCfu() {
        return cfu;
    }

    public void setCfu(Integer cfu) {
        this.cfu = cfu;
    }

    public Boolean isAbilitato() {
        return abilitato;
    }

    public void setAbilitato(Boolean abilitato) {
        this.abilitato = abilitato;
    }

    public LocalDate getDataModifica() {
        return dataModifica;
    }

    public void setDataModifica(LocalDate dataModifica) {
        this.dataModifica = dataModifica;
    }

    public Long getRelMatCdlId() {
        return relMatCdlId;
    }

    public void setRelMatCdlId(Long cdlId) {
        this.relMatCdlId = cdlId;
    }

    public String getRelMatCdlNome() {
        return relMatCdlNome;
    }

    public void setRelMatCdlNome(String cdlNome) {
        this.relMatCdlNome = cdlNome;
    }

    public Long getRelMatTutId() {
        return relMatTutId;
    }

    public void setRelMatTutId(Long tutorId) {
        this.relMatTutId = tutorId;
    }

    public String getRelMatTutCognome() {
        return relMatTutCognome;
    }

    public void setRelMatTutCognome(String tutorCognome) {
        this.relMatTutCognome = tutorCognome;
    }

    public Long getRelMatDocId() {
        return relMatDocId;
    }

    public void setRelMatDocId(Long docentiId) {
        this.relMatDocId = docentiId;
    }

    public String getRelMatDocCognome() {
        return relMatDocCognome;
    }

    public void setRelMatDocCognome(String docentiCognome) {
        this.relMatDocCognome = docentiCognome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MaterieDTO materieDTO = (MaterieDTO) o;
        if(materieDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), materieDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MaterieDTO{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", cfu=" + getCfu() +
            ", abilitato='" + isAbilitato() + "'" +
            ", dataModifica='" + getDataModifica() + "'" +
            "}";
    }
}

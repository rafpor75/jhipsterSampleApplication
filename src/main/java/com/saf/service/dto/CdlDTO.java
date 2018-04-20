package com.saf.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Cdl entity.
 */
public class CdlDTO implements Serializable {

    private Long id;

    private String codice;

    private String nome;

    private Boolean abilitato;

    private Long facoltaId;

    private String facoltaNome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isAbilitato() {
        return abilitato;
    }

    public void setAbilitato(Boolean abilitato) {
        this.abilitato = abilitato;
    }

    public Long getFacoltaId() {
        return facoltaId;
    }

    public void setFacoltaId(Long facoltaId) {
        this.facoltaId = facoltaId;
    }

    public String getFacoltaNome() {
        return facoltaNome;
    }

    public void setFacoltaNome(String facoltaNome) {
        this.facoltaNome = facoltaNome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CdlDTO cdlDTO = (CdlDTO) o;
        if(cdlDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), cdlDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CdlDTO{" +
            "id=" + getId() +
            ", codice='" + getCodice() + "'" +
            ", nome='" + getNome() + "'" +
            ", abilitato='" + isAbilitato() + "'" +
            "}";
    }
}

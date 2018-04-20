package com.saf.service.mapper;

import com.saf.domain.*;
import com.saf.service.dto.MaterieDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Materie and its DTO MaterieDTO.
 */
@Mapper(componentModel = "spring", uses = {CdlMapper.class, TutorMapper.class, DocentiMapper.class})
public interface MaterieMapper extends EntityMapper<MaterieDTO, Materie> {

    @Mapping(source = "relMatCdl.id", target = "relMatCdlId")
    @Mapping(source = "relMatCdl.nome", target = "relMatCdlNome")
    @Mapping(source = "relMatTut.id", target = "relMatTutId")
    @Mapping(source = "relMatTut.cognome", target = "relMatTutCognome")
    @Mapping(source = "relMatDoc.id", target = "relMatDocId")
    @Mapping(source = "relMatDoc.cognome", target = "relMatDocCognome")
    MaterieDTO toDto(Materie materie);

    @Mapping(source = "relMatCdlId", target = "relMatCdl")
    @Mapping(source = "relMatTutId", target = "relMatTut")
    @Mapping(source = "relMatDocId", target = "relMatDoc")
    Materie toEntity(MaterieDTO materieDTO);

    default Materie fromId(Long id) {
        if (id == null) {
            return null;
        }
        Materie materie = new Materie();
        materie.setId(id);
        return materie;
    }
}

import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { JhipsterSampleApplicationFacoltaModule } from './facolta/facolta.module';
import { JhipsterSampleApplicationAnnoAccademicoModule } from './anno-accademico/anno-accademico.module';
import { JhipsterSampleApplicationCdlModule } from './cdl/cdl.module';
import { JhipsterSampleApplicationDocentiModule } from './docenti/docenti.module';
import { JhipsterSampleApplicationMaterieModule } from './materie/materie.module';
import { JhipsterSampleApplicationPianiDiStudioModule } from './piani-di-studio/piani-di-studio.module';
import { JhipsterSampleApplicationSediModule } from './sedi/sedi.module';
import { JhipsterSampleApplicationStudentiModule } from './studenti/studenti.module';
import { JhipsterSampleApplicationTutorModule } from './tutor/tutor.module';
import { JhipsterSampleApplicationEsamiModule } from './esami/esami.module';
import { JhipsterSampleApplicationNoteEsameModule } from './note-esame/note-esame.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        JhipsterSampleApplicationFacoltaModule,
        JhipsterSampleApplicationAnnoAccademicoModule,
        JhipsterSampleApplicationCdlModule,
        JhipsterSampleApplicationDocentiModule,
        JhipsterSampleApplicationMaterieModule,
        JhipsterSampleApplicationPianiDiStudioModule,
        JhipsterSampleApplicationSediModule,
        JhipsterSampleApplicationStudentiModule,
        JhipsterSampleApplicationTutorModule,
        JhipsterSampleApplicationEsamiModule,
        JhipsterSampleApplicationNoteEsameModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipsterSampleApplicationEntityModule {}

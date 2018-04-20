import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JhipsterSampleApplicationSharedModule } from '../../shared';
import {
    PianiDiStudioService,
    PianiDiStudioPopupService,
    PianiDiStudioComponent,
    PianiDiStudioDetailComponent,
    PianiDiStudioDialogComponent,
    PianiDiStudioPopupComponent,
    PianiDiStudioDeletePopupComponent,
    PianiDiStudioDeleteDialogComponent,
    pianiDiStudioRoute,
    pianiDiStudioPopupRoute,
} from './';

const ENTITY_STATES = [
    ...pianiDiStudioRoute,
    ...pianiDiStudioPopupRoute,
];

@NgModule({
    imports: [
        JhipsterSampleApplicationSharedModule,
        RouterModule.forChild(ENTITY_STATES)
    ],
    declarations: [
        PianiDiStudioComponent,
        PianiDiStudioDetailComponent,
        PianiDiStudioDialogComponent,
        PianiDiStudioDeleteDialogComponent,
        PianiDiStudioPopupComponent,
        PianiDiStudioDeletePopupComponent,
    ],
    entryComponents: [
        PianiDiStudioComponent,
        PianiDiStudioDialogComponent,
        PianiDiStudioPopupComponent,
        PianiDiStudioDeleteDialogComponent,
        PianiDiStudioDeletePopupComponent,
    ],
    providers: [
        PianiDiStudioService,
        PianiDiStudioPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipsterSampleApplicationPianiDiStudioModule {}

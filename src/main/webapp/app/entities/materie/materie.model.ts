import { BaseEntity } from './../../shared';

export class Materie implements BaseEntity {
    constructor(
        public id?: number,
        public nome?: string,
        public cfu?: number,
        public abilitato?: boolean,
        public dataModifica?: any,
        public relMatCdlNome?: string,
        public relMatCdlId?: number,
        public relMatTutCognome?: string,
        public relMatTutId?: number,
        public relMatDocCognome?: string,
        public relMatDocId?: number,
    ) {
        this.abilitato = false;
    }
}

import { BaseEntity } from './../../shared';

export class Cdl implements BaseEntity {
    constructor(
        public id?: number,
        public codice?: string,
        public nome?: string,
        public abilitato?: boolean,
        public relCdlMats?: BaseEntity[],
        public facoltaNome?: string,
        public facoltaId?: number,
    ) {
        this.abilitato = false;
    }
}

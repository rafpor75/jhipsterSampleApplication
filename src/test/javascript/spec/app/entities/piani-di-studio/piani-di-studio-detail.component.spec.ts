/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, async } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

import { JhipsterSampleApplicationTestModule } from '../../../test.module';
import { PianiDiStudioDetailComponent } from '../../../../../../main/webapp/app/entities/piani-di-studio/piani-di-studio-detail.component';
import { PianiDiStudioService } from '../../../../../../main/webapp/app/entities/piani-di-studio/piani-di-studio.service';
import { PianiDiStudio } from '../../../../../../main/webapp/app/entities/piani-di-studio/piani-di-studio.model';

describe('Component Tests', () => {

    describe('PianiDiStudio Management Detail Component', () => {
        let comp: PianiDiStudioDetailComponent;
        let fixture: ComponentFixture<PianiDiStudioDetailComponent>;
        let service: PianiDiStudioService;

        beforeEach(async(() => {
            TestBed.configureTestingModule({
                imports: [JhipsterSampleApplicationTestModule],
                declarations: [PianiDiStudioDetailComponent],
                providers: [
                    PianiDiStudioService
                ]
            })
            .overrideTemplate(PianiDiStudioDetailComponent, '')
            .compileComponents();
        }));

        beforeEach(() => {
            fixture = TestBed.createComponent(PianiDiStudioDetailComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(PianiDiStudioService);
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
                // GIVEN

                spyOn(service, 'find').and.returnValue(Observable.of(new HttpResponse({
                    body: new PianiDiStudio(123)
                })));

                // WHEN
                comp.ngOnInit();

                // THEN
                expect(service.find).toHaveBeenCalledWith(123);
                expect(comp.pianiDiStudio).toEqual(jasmine.objectContaining({id: 123}));
            });
        });
    });

});

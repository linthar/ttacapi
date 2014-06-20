package ar.edu.unq.tac.market.service;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.repository.ApplicationRepository;
import ar.edu.unq.tac.market.repository.factory.ApplicationFactory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collection;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationServiceImplTest {

	@Mock
    private ApplicationRepository applicationRepositoryMock;

    private ApplicationService applicationService;

    @Before
    public void setUp() throws Exception {
        applicationService = new ApplicationServiceImpl();
        ((ApplicationServiceImpl) applicationService).applicationRepository = applicationRepositoryMock;
    }

    @Test
    public void findAll_DatabaseConDatos() throws Exception {
    	int expected = ApplicationFactory.amount();
        stubRepositoryMockFindAll(9);
        Collection<Application> list = applicationService.all();
        assertNotNull(list);
        assertEquals(expected, list.size());
        verify(applicationRepositoryMock, times(1)).findAll();
    }

    private void stubRepositoryMockFindAll(int cantidad) {
        when(applicationRepositoryMock.findAll()).thenReturn(
                ApplicationFactory.getApplicationList());
    }

    @Test
    public void findAll_DatabaseSinDatos() throws Exception {
    	int expected = ApplicationFactory.amount();
        stubRepositoryMockFindAll(0);
        Collection<Application> list = applicationService.all();
        assertNotNull(list);
        assertEquals(expected, list.size());
        verify(applicationRepositoryMock, times(1)).findAll();
    }


}

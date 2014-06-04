package ar.edu.unq.tac.market.controller;

import ar.edu.unq.tac.market.domain.Application;
import ar.edu.unq.tac.market.repository.factory.ApplicationFactory;
import ar.edu.unq.tac.market.service.ApplicationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationControllerTest {

    @Mock
    private ApplicationService applicationServiceMock;

    private ApplicationController aplicacionController;

    @Before
    public void setUp() throws Exception {
        aplicacionController = new ApplicationController();
        aplicacionController.applicationService = applicationServiceMock;
    }

    @Test
    public void shouldListAllUsers() throws Exception {
        when(applicationServiceMock.all()).thenReturn(
                ApplicationFactory.getApplicationList("", 10));

        Collection<Application> apps = aplicacionController.findAll();
        assertNotNull(apps);
        assertEquals(10, apps.size());
        // verify user was passed to UserService
        verify(applicationServiceMock, times(1)).all();
    }

}

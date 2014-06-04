package ar.edu.unq.tac.tienda.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ar.edu.unq.tac.tienda.domain.Aplicacion;
import ar.edu.unq.tac.tienda.repository.factory.AplicacionFactory;
import ar.edu.unq.tac.tienda.service.AplicacionService;

@RunWith(MockitoJUnitRunner.class)
public class AplicacionControllerTest {

	@Mock
	private AplicacionService aplicacionServiceMock;

	private AplicacionController aplicacionController;

	@Before
	public void setUp() throws Exception {
		aplicacionController = new AplicacionController();
		aplicacionController.aplicacionService = aplicacionServiceMock;
	}

	@Test
	public void shouldListAllUsers() throws Exception {
		when(aplicacionServiceMock.todas()).thenReturn(
				AplicacionFactory.getListAplicaciones("",10));

		Collection<Aplicacion> apps = aplicacionController.findAll();
		assertNotNull(apps);
		assertEquals(10, apps.size());
		// verify user was passed to UserService
		verify(aplicacionServiceMock, times(1)).todas();
	}

}

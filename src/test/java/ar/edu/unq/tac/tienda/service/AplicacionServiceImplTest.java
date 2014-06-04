package ar.edu.unq.tac.tienda.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
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
import ar.edu.unq.tac.tienda.repository.AplicacionRepository;
import ar.edu.unq.tac.tienda.repository.factory.AplicacionFactory;

@RunWith(MockitoJUnitRunner.class)
public class AplicacionServiceImplTest {

	@Mock
	private AplicacionRepository aplicacionRepositoryMock;

	private AplicacionService aplicacionService;

	@Before
	public void setUp() throws Exception {
		aplicacionService = new AplicacionServiceImpl();
		((AplicacionServiceImpl) aplicacionService).aplicacionRepository = aplicacionRepositoryMock;
	}

	@Test
	public void findAll_DatabaseConDatos() throws Exception {
		stubRepositoryMockFindAll(10);
		Collection<Aplicacion> list = aplicacionService.todas();
		assertNotNull(list);
		assertEquals(10, list.size());
		verify(aplicacionRepositoryMock, times(1)).findAll();
	}

	private void stubRepositoryMockFindAll(int cantidad) {
		when(aplicacionRepositoryMock.findAll()).thenReturn(
				AplicacionFactory.getListAplicaciones("",cantidad));
	}

	@Test
	public void findAll_DatabaseSinDatos() throws Exception {
		stubRepositoryMockFindAll(0);
		Collection<Aplicacion> list = aplicacionService.todas();
		assertNotNull(list);
		assertTrue(list.isEmpty());
		verify(aplicacionRepositoryMock, times(1)).findAll();
	}
	

}

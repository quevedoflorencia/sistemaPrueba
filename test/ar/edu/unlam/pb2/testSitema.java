package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSitema {

	@Test
	public void queSePuedaCrearUnSistema() {
	
		//preparacion
		Sistema sistemaUnlam;
		Usuario usuarioActual;
		
		//ejecucion
		
		sistemaUnlam= new Sistema ("asistenciaUnlam", 1);
		usuarioActual= new Usuario ("juan", "pb2",42, ESTADO.CREADO);
		//validacion
		
		assertNotNull(sistemaUnlam);
				
	}
	
	@Test
	public void queSePuedaAgregarUnUsuario() {
	
		Integer cantidadDeUsuariosEsperados=1;
		Sistema sistemaUnlam= new Sistema ("asistenciaUnlam", 2);
		Usuario usuarioActual= new Usuario ("juan", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual2= new Usuario ("juanP", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual3= new Usuario ("juan3", "pb2",42, ESTADO.CREADO);
		
		Boolean sePuedoAgregarUnUsuario=sistemaUnlam.agregarUnUsuario(usuarioActual);
		//Boolean sePuedoAgregarUnUsuario2=sistemaUnlam.agregarUnUsuario(usuarioActual2);
		//Boolean sePuedoAgregarUnUsuario3=sistemaUnlam.agregarUnUsuario(usuarioActual3);
		//assertTrue(sePuedoAgregarUnUsuario);
		//assertTrue(sePuedoAgregarUnUsuario2);
		assertEquals(cantidadDeUsuariosEsperados, sistemaUnlam.getCantidadTotalUsuarios());
		
	}
	
	
	//c. Desarrolle el método calcularLaCantidadDeUsuariosLogueados.
	@Test
	public void queSePuedaCalcularLaCantidadDeUsuriosLogueados() {
	
		Integer cantidadDeUsuariosLogueadosEsperados=3;
	
		Sistema sistemaUnlam= new Sistema ("asistenciaUnlam", 3);
		Usuario usuarioActual= new Usuario ("juan1", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual2= new Usuario ("juan2", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual3= new Usuario ("juan3", "pb2",42, ESTADO.CREADO);
		//Usuario usuario4=new Usuario ("pablo","pb2",35, ESTADO.LOGUEADO);
	
		
		sistemaUnlam.agregarUnUsuario(usuarioActual);
		sistemaUnlam.loguearUsuario(usuarioActual);
		sistemaUnlam.agregarUnUsuario(usuarioActual2);
		sistemaUnlam.loguearUsuario(usuarioActual2);
		sistemaUnlam.agregarUnUsuario(usuarioActual3);
		sistemaUnlam.loguearUsuario(usuarioActual3);
		
		
		
		assertEquals(cantidadDeUsuariosLogueadosEsperados, sistemaUnlam.calcularCantidadDeUsuariosLogueados());
	
		
	}
//d.	Desarrolle el método calcularLaCantidadDeUsuariosBloqueados.
	
	@Test
	public void queSePuedaCalcularLaCantidadDeUsuriosBloqueados() {
	
		Integer cantidadDeUsuariosBloqueadosEsperados=5;
	
		Sistema sistemaUnlam= new Sistema ("asistenciaUnlam", 3);
		Usuario usuarioActual= new Usuario ("juan1", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual2= new Usuario ("juan2", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual3= new Usuario ("juan3", "pb2",42, ESTADO.CREADO);
		//Usuario usuario4=new Usuario ("pablo","pb2",35, ESTADO.LOGUEADO);
	
		
		sistemaUnlam.agregarUnUsuario(usuarioActual);
		sistemaUnlam.bloquearUsuario(usuarioActual);
		sistemaUnlam.agregarUnUsuario(usuarioActual2);
		sistemaUnlam.bloquearUsuario(usuarioActual2);
		sistemaUnlam.agregarUnUsuario(usuarioActual3);
		sistemaUnlam.bloquearUsuario(usuarioActual3);
		
		
		
		assertEquals(cantidadDeUsuariosBloqueadosEsperados, sistemaUnlam.calcularCantidadDeUsuariosBloqueados());
	
		
	}
//e. Desarrolle el método calcularElPorcentajeDeUsuariosLogueados.	
	@Test
	public void queSePuedaCalcularElPorcentajeDeUsuariosLogueados() {
	
		Double porcentajeDeUsuariosLogueadoEsperados=1.0;
	
		Sistema sistemaUnlam= new Sistema ("asistenciaUnlam", 3);
		
		Usuario usuarioActual= new Usuario ("juan1", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual2= new Usuario ("juan2", "pb2",42, ESTADO.CREADO);
		Usuario usuarioActual3= new Usuario ("juan3", "pb2",42, ESTADO.CREADO);
		Usuario usuario4=new Usuario ("pablo","pb2",35, ESTADO.CREADO);
	
		
		sistemaUnlam.agregarUnUsuario(usuarioActual);
		sistemaUnlam.agregarUnUsuario(usuarioActual2);
		sistemaUnlam.agregarUnUsuario(usuarioActual3);
		sistemaUnlam.agregarUnUsuario(usuario4);
		
		
		sistemaUnlam.loguearUsuario(usuarioActual);
		sistemaUnlam.loguearUsuario(usuarioActual2);
		sistemaUnlam.loguearUsuario(usuarioActual3);
		

		
		
//		assertEquals(porcentajeDeUsuariosLogueadoEsperados, sistemaUnlam.calcularPorcentajeDeUsuariosLogueados(),0.00);
	
		
	}

	
	//f. Desarrolle el método calcularEdadPromedio para conocer a qué público está
	//dirigido el sistema.
	@Test
	public void queSePuedaCalcularLaEdadPromedioDeLosUsuaios() {
	
		int edadPromedioDeUsuariosEsperado=30;
	
		Sistema sistemaUnlam= new Sistema ("asistenciaUnlam", 3);
		
		Usuario usuarioActual= new Usuario ("juan1", "pb2",44, ESTADO.CREADO);
		Usuario usuarioActual2= new Usuario ("juan2", "pb2",24, ESTADO.CREADO);
		Usuario usuarioActual3= new Usuario ("juan3", "pb2",17, ESTADO.CREADO);
		Usuario usuario4=new Usuario ("pablo","pb2",35, ESTADO.CREADO);
	
		
		sistemaUnlam.agregarUnUsuario(usuarioActual);
		sistemaUnlam.agregarUnUsuario(usuarioActual2);
		sistemaUnlam.agregarUnUsuario(usuarioActual3);
		sistemaUnlam.agregarUnUsuario(usuario4);
			
		assertEquals(edadPromedioDeUsuariosEsperado, sistemaUnlam.calcularEdadPromedioDeLosUsuarios(),0.0);
		
	}
	
	//g. En la clase Sistema desarrolle el método loguearUsuario, el cual devolverá true si se logra loguear al usuario y false en caso contrario:
	//	public boolean loguearUsuario (String usuario, String contraseña)
	
	@Test
	public void queSePuedaLoguearUnUsuario() {
	
		//String usuarioEsperado="juan";
		//String contraseniaEsperada= "pb2";
	
		Sistema sistemaUnlam= new Sistema ("asistenciaUnlam", 3);
		
		Usuario usuarioActual= new Usuario ("juan", "pb2",44, ESTADO.CREADO);
	
	
		
		sistemaUnlam.agregarUnUsuario(usuarioActual);
		
		assertTrue(sistemaUnlam.loguearUsuario1(usuarioActual));
	
			
		
	}
	
	
	
	
}

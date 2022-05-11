package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistemaUnlam= new Sistema ("asistenciaUnlam", 2);
		Usuario usuario1= new Usuario ("juan", "pb2",42, ESTADO.CREADO);
		Usuario usuario2= new Usuario ("pedro", "pb2",42, ESTADO.CREADO);
		
		ArrayList<Usuario>usuarios=new ArrayList<Usuario>();
		
		sistemaUnlam.agregarUnUsuario(usuario1);
		sistemaUnlam.agregarUnUsuario(usuario2);
		
		for (Usuario actual : usuarios) {
			System.out.println(actual);
		}
	
		
		
		
		
		
	}

}

package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Sistema {

	private String nombre;
	private Integer cantidadMaximaDeUsuarios;
	private ArrayList<Usuario>usuarios;
	//private HashSet<Usuario>usuarios;

	public Sistema(String nombre, Integer cantidadMaximaDeUsuarios) {
		this.nombre=nombre;
		this.cantidadMaximaDeUsuarios=cantidadMaximaDeUsuarios;
		//this.usuarios=new HashSet<Usuario>();
		this.usuarios=new ArrayList<Usuario>();
	}

	public Boolean agregarUnUsuario(Usuario usuarioX) {
		
		Boolean sePuedoAgregarUsuario=false;
		/*
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getNombre().equals(usuarioX.getNombre())) {
			
				return sePuedoAgregarUsuario;
				
			}else {
				usuarios.add(usuarioX);
				sePuedoAgregarUsuario=true;
				
			}
				
		}
		
		return sePuedoAgregarUsuario;
		
	}	*/
		
	if (usuarios.contains(usuarioX)) {
		return sePuedoAgregarUsuario;
	} else {
		usuarios.add(usuarioX);
		sePuedoAgregarUsuario=true;
	}
	return sePuedoAgregarUsuario;
	}
	
	/*
	if (!usuarios.contains(usuarioX)) {
		usuarios.add(usuarioX);
		sePuedoAgregarUsuario=true;
		
	
		
	}
	return sePuedoAgregarUsuario;
}*/

	public Integer calcularCantidadDeUsuariosLogueados() {
		Integer cantidadDeUsuraiosLogueados=0;
		
		for (Usuario usuario : usuarios) {
			if (usuario.getESTADO()==ESTADO.LOGUEADO) {
				cantidadDeUsuraiosLogueados++;
							
			}
		}
		
	
		return cantidadDeUsuraiosLogueados;
	}

	public Integer getCantidadTotalUsuarios() {
		
		return usuarios.size();
	}

	public void loguearUsuario(Usuario usuarioActual) {
		
		usuarioActual.setESTADO(ESTADO.LOGUEADO);
	}

	public void bloquearUsuario(Usuario usuarioActual) {
		usuarioActual.setESTADO(ESTADO.BLOQUEADO);
		
	}

	public Integer calcularCantidadDeUsuariosBloqueados() {
		
		Integer cantidadDeUsuariosBloqueados=0;
		for (Usuario usuario : usuarios) {
			if (usuario.getESTADO()==ESTADO.BLOQUEADO) {
				cantidadDeUsuariosBloqueados++;
				
			}
		}
		return cantidadDeUsuariosBloqueados;
	}

	public double calcularPorcentajeDeUsuariosLogueados() {
		
		//Double porcentajeUsuariosLogueados= (double) (this.calcularCantidadDeUsuariosLogueados()/this.getCantidadTotalUsuarios());
			
		Integer cantidadDeUsuariosLogueados=this.calcularCantidadDeUsuariosLogueados();
		Integer cantidadDeUsuarios=this.getCantidadTotalUsuarios();
		
		double porcentajeUsuariosLogueados=(double) (cantidadDeUsuariosLogueados/cantidadDeUsuarios);
		return porcentajeUsuariosLogueados;
		
		//return porcentajeUsuariosLogueados;
	}

	public int calcularEdadPromedioDeLosUsuarios() {
		int sumatoriaDeEdades=0;
		int edadPromedio=0;
		
		for (Usuario usuario : usuarios) {
			sumatoriaDeEdades+=usuario.getEdad();
		}
		 return edadPromedio=sumatoriaDeEdades/this.getCantidadTotalUsuarios();
		
	
	}

	public Boolean loguearUsuario1(Usuario usuarioPrueba) {
		Boolean sePudoLoguear=false;
		
		
		
		for (Usuario usuario : usuarios) {
			if ((usuario.getNombre().equals(usuarioPrueba.getNombre()) && (usuario.getContrasenia().equals(usuarioPrueba.getContrasenia())))) {
				usuario.setESTADO(ESTADO.LOGUEADO);
				sePudoLoguear=true;
			} else {
				sePudoLoguear=false;
			}
				
					
		}
		return sePudoLoguear;
	}
		
}


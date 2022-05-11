package ar.edu.unlam.pb2;

import java.util.Objects;

public class Usuario {

	private String nombre;
	private String contrasenia;
	private Integer edad;
	private ESTADO ESTADO;

	public Usuario(String nombre, String contrasenia, Integer edad, ESTADO estado) {
		this.nombre=nombre;
		this.contrasenia=contrasenia;
		this.edad=edad;
		this.ESTADO=ESTADO.CREADO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public ESTADO getESTADO() {
		return ESTADO;
	}

	public void setESTADO(ESTADO eSTADO) {
		ESTADO = eSTADO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre, other.nombre);
	}







	
	



	


}

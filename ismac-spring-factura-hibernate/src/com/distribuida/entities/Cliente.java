package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "cliente")
public class Cliente {
	
	 //id_cliente, cedula, nombre, apellido, edad, fecha_nac, direccion, telefono, correo
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_Cliente")
	private int idCliente;
	 @Column(name = "nombre")
	private String nombre;
	 @Column(name = "apellido")
	private String apellido;
	 @Column(name = "cedula")
	private String cedula;
	 @Column(name = "edad")
	private int edad; 
	 @Column(name = "fecha_nac")
	private Date fechaNacimiento;
	 @Column(name = "direccion")
	private String direccion;
	 @Column(name = "correo")
	private String correo;
	 @Column(name = "telefono")
	private String telefono;
	
	public Cliente() {
		
	}

	
	
	
	
	public Cliente(int idCliente, String nombre, String apellido, String cedula, int edad, Date fechaNacimiento,
			String direccion, String correo, String telefono) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
	}





	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
				+ cedula + ", edad=" + edad + ", direccion=" + direccion + ", correo=" + correo + ", telefono="
				+ telefono + "]";
	}
	
}

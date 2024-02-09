package com.distribuida.principaldto;


import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalClienteDto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteService clienteService = context.getBean("clienteServiceImpl",ClienteService.class);
		
		//CRUD 
		//add
		//Cliente cliente= new Cliente(0,"16876698756","nombre1","apellido1",99,new Date(),"direccion1","telefono1","correo@correo.com");
		
		clienteService.add(0, "1761026309","ruby","enriquez",21,new Date(),"av_puembo", "telefono3","hola");
		
		
		//UP
		Cliente cliente1= new Cliente(31,"16876698755","nombre55","apellido45",98,new Date(),"direccio51","telefono14","correo@5correo.com");
		//clienteService.up(cliente1);
		
		//del
		//clienteService.del(31);
				
		
		
		//findALL
		List<Cliente> clientes =clienteService.findAll();
		
		//impresion
		for (Cliente item : clientes) {
			
		
			System.out.println(item.toString());
			
		}
		//findOne
		//Cliente cliente = clienteService.findOne(3);
		//System.out.println(cliente.toString());
		
		context.close();

	}

}

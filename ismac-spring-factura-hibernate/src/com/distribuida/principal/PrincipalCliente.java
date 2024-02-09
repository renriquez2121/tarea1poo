package com.distribuida.principal;


import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		//CRUD 
		//add
		Cliente cliente= new Cliente(0,"16876698756","nombre1","apellido1",99,new Date(),"direccion1","telefono1","correo@correo.com");
		
		//clienteDAO.add(cliente);
		
		
		//UP
		Cliente cliente1= new Cliente(31,"16876698755","nombre55","apellido45",98,new Date(),"direccio51","telefono14","correo@5correo.com");
		//clienteDAO.up(cliente1);
		
		//del
		clienteDAO.del(31);
				
		
		
		//findALL
		List<Cliente> clientes =clienteDAO.findAll();
		
		//impresion
		for (Cliente item : clientes) {
			
		
			System.out.println(item.toString());
			
		}
		//findOne
		//Cliente cliente = clienteDAO.findOne(3);
		//System.out.println(cliente.toString());
		
		context.close();

	}

}

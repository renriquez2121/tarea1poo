package com.distribuida.principaldto;

import java.sql.Connection;
import java.sql.DriverManager;

public class pruebajdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String urlJDBC="jdbc:mysql://localhost:3306/bdfactura";
		String user="root";
		String clave="root";
		
		try {
			System.out.println("Estableciedo conexión...");
			Connection connection =DriverManager.getConnection(urlJDBC,user,clave);
			System.out.println("Conexión establecida...");
		}catch(Exception e) {
		
		e.printStackTrace();
	}

	}

}

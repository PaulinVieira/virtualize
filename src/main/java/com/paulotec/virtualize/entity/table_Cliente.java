package com.paulotec.virtualize.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;


@Data
public class table_Cliente {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id_cliente;
		private String nome_completo;
	    private String username;
	    private String password;
		private String cpf;
	}



package com.david.produtos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {

	private Long codigo;
	private String nome;
	private String marca;
}
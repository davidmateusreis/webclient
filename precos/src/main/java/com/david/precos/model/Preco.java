package com.david.precos.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Preco {

	private Long codigoProduto;
	private BigDecimal preco;
}

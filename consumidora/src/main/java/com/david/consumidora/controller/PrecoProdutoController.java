package com.david.consumidora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.david.consumidora.model.ProdutoComPreco;
import com.david.consumidora.service.PrecoProdutoService;

@RestController
public class PrecoProdutoController {

	@Autowired
	private PrecoProdutoService precoProdutoService;
	
	@GetMapping("/produto/{codigo}/preco")
	public ResponseEntity<ProdutoComPreco> obterProdutoComPreco(@PathVariable Long codigo) {
		
		ProdutoComPreco produtoComPreco = this.precoProdutoService.obterPorCodigo(codigo);

		return ResponseEntity.ok(produtoComPreco);
	}
}

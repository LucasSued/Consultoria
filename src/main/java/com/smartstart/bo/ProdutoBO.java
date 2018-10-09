package com.smartstart.bo;

import java.util.ArrayList;
import java.util.List;

import com.smartstart.model.Model;

public class ProdutoBO {

	static List<Model> produtos = new ArrayList<>();
	

	public void incluirProdutos(Model produto) {
		produtos.add(produto);
	}

	public Model pesquisa(Integer id) {
       Model produto = null;
		for (Model m : produtos) 
		{
			if (m.getId().equals(id)) {
				produto = m;
				break;
			}
		}

		return produto;

	}
	public List<Model> pesquisaTodos() {	      
													
			return produtos;
							
		}
	
	public void excluir (Integer id) {		
		
			for (Model m : produtos) 
			{
				if (m.getId().equals(id)) {
					produtos.remove(m);
					break;
				}
			}
	       String msg="Produto excluido com sucesso!";
	       
			
		}
	
	
}

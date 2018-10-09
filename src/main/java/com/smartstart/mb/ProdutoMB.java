package com.smartstart.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.smartstart.bo.ProdutoBO;
import com.smartstart.model.Model;

@ManagedBean
public class ProdutoMB {

	Model produto = new Model();
	ProdutoBO bo = new ProdutoBO();

	public Model getProduto() {

		return produto;
	}

	public void setProduto(Model produto) {

		this.produto = produto;
	}

	private String msgErro;

	private List<Model> produtos;

	public String getMsgErro() {
		return msgErro;
	}

	public List<Model> getProdutos() {
		return produtos;
	}

	public String salvar() {
		String view="erro";
				msgErro = "Produto cadastrado com sucesso!";
				view = "resultado";
				bo.incluirProdutos(produto);
			

			return view;

		
	}

	public String pesquisar() {

		produto = bo.pesquisa(produto.getId());
		if (produto == null) {
			msgErro = "produto não encontrado";
			return "erro";
		}

		return "vizualizar";

	}

	public String pesquisarTodos() {

		produtos = bo.pesquisaTodos();

		return "resultados";

	}

	public String excluir(String id) {
		System.out.println(id);
		//bo.excluir(id);
		
		return "vizualizar";

	}

	/*public String editar() {


		if (produto.getId() == null) {
			msgErro = "preencha o campo de id para fazer a pesquisa";
			return "erro";
		}
		//msgErro = bo.excluir(produto.getId());
		return "resultado";

	}*/

	// paginas de retorno
	public String abrirCadastro() {
		return "cadastro";

	}

	public String abrirPesquisa() {
		produtos = bo.pesquisaTodos();
		return "pesquisa";

	}

	public String abrirMenu() {
		return "menu";

	}

}

package br.edu.unoesc.managedBean;

import java.util.ArrayList;
import java.util.List;
import br.edu.unoesc.model.Categoria;
import br.edu.unoesc.services.CategoriaService;

public class CategoriaMB {

	private Categoria categoria;
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private CategoriaService servicos = new CategoriaService();

	public CategoriaMB() {
		categorias = servicos.listar();
		categoria = new Categoria();

	}

	public void salvar() {
		if (categorias.contains(categoria)) {
			int posicao = categorias.indexOf(categoria);
			categorias.set(posicao, categoria);
			servicos.alterar(categoria);

		} else {
			categorias.add(categoria);
			servicos.inserir(categoria);

		}
		categoria = new Categoria();
	}

	public void excluir() {

		categorias.remove(categoria);
		servicos.remover(categoria);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public CategoriaService getServicos() {
		return servicos;
	}

	public void setServicos(CategoriaService servicos) {
		this.servicos = servicos;
	}

}
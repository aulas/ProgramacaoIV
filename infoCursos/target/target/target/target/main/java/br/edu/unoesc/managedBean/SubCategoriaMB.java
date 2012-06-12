package br.edu.unoesc.managedBean;

import java.util.ArrayList;
import java.util.List;
import br.edu.unoesc.model.Subcategoria;
import br.edu.unoesc.services.SubcategoriaService;

public class SubCategoriaMB {

	private Subcategoria subcategoria;
	private List<Subcategoria> subcategorias = new ArrayList<Subcategoria>();
	private SubcategoriaService servicos = new SubcategoriaService();

	public SubCategoriaMB() {
		subcategorias = servicos.listar();
		subcategoria = new Subcategoria();

	}

	public void salvar() {
		if (subcategorias.contains(subcategoria)) {
			int posicao = subcategorias.indexOf(subcategoria);
			subcategorias.set(posicao, subcategoria);
			servicos.alterar(subcategoria);

		} else {
			subcategorias.add(subcategoria);
			servicos.inserir(subcategoria);

		}
		subcategoria = new Subcategoria();
	}

	public void excluir() {

		subcategorias.remove(subcategoria);
		servicos.remover(subcategoria);
	}

	public Subcategoria getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}

	public List<Subcategoria> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(List<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}

	public SubcategoriaService getServicos() {
		return servicos;
	}

	public void setServicos(SubcategoriaService servicos) {
		this.servicos = servicos;
	}

}
package br.edu.unoesc.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.unoesc.model.Estado;
import br.edu.unoesc.services.EstadoService;

/**
 * 
 * @author agosti
 */
@ManagedBean
@SessionScoped
public class EstadoMB {
	private Estado estado;
	private List<Estado> estados = new ArrayList<Estado>();
	private EstadoService servicos = new EstadoService();

	public EstadoMB() {
		estados = servicos.listar();
		estado = new Estado();
	}

	public void salvar() {
		// se a lista de estados contiver o estado então vou alterar
		if (estados.contains(estado)) {
			// pego a posição do estado dentro da lista
			int posicao = estados.indexOf(estado);
			// modifico o estado
			estados.set(posicao, estado);
			servicos.alterar(estado);
		} else { // incluir
			estados.add(estado);
			servicos.inserir(estado);
		}
		estado = new Estado();
	}

	public String selecionar() {
		return "cadastroEstado.xhtml";
	}

	public void excluir() {
		estados.remove(estado);
		servicos.remover(estado);
		estado = new Estado();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

}

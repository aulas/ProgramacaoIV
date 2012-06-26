package br.edu.unoesc.managedBean;


import java.util.ArrayList;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import br.edu.unoesc.model.Cidade;
import br.edu.unoesc.model.Estado;
import br.edu.unoesc.services.CidadeService;
import br.edu.unoesc.services.EstadoService;

@ManagedBean
@SessionScoped
public class CidadeMB {
	private Cidade cidade;
	private List<Cidade> cidades = new ArrayList<Cidade>();
	private CidadeService servicos = new CidadeService();
	private List<Estado> estados = new ArrayList<Estado>();
	private EstadoService servicosEstados = new EstadoService();
	
	
	public EstadoService getServicosEstados() {
		return servicosEstados;
	}
	public void setServicosEstados(EstadoService servicosEstados) {
		this.servicosEstados = servicosEstados;
	}
	public CidadeService getServicos() {
		return servicos;
	}
	public void setServicos(CidadeService servicos) {
		this.servicos = servicos;
	}
	public List<Estado> getEstados() {
		return estados;
	}
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
	public EstadoService getServicosEstado() {
		return servicosEstados;
	}
	public void setServicosEstado(EstadoService servicosEstado) {
		this.servicosEstados = servicosEstado;
	}
	public List<Cidade> getCidades() {
		return cidades;
	}
	public CidadeMB(){
		cidades = servicos.listar();
		cidade = new Cidade();
	    estados = servicosEstados.listar();
	}
	
	public void salvar(){
		if (cidades.contains(cidade)){
			int posicao = cidades.indexOf(cidade);
			servicos.alterar(cidade);
		}
		else{
			cidades.add(cidade);
			servicos.inserir(cidade);
		}
		cidade = new Cidade();
	}
	public String selecionar(){
		return "cadastroCidade.xhtml";
	}
	
	public void excluir() {
		cidades.remove(cidade);
		servicos.remover(cidade);
		cidade = new Cidade();
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getcidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
}

	

	